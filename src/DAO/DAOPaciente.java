/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A
 */
public class DAOPaciente {
     Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;  
    
    public DAOPaciente() throws SQLException, ClassNotFoundException
    {
        cn = bd.connect();
    }
    
    
    public boolean insertPacient(Patient paciente)
    {
        try {
            String query = "Insert into paciente(nss,primernombre,apellido,edad,direccion,telefono,email,"+
                    "peso,altura,enfermedad,idcuarto,status) values"
                    + "('" + paciente.getSecurityNumber() + "','" + paciente.getFirstname() + "'"
                    + ",'" + paciente.getLastname() + "',"+paciente.getAge()+",'"+paciente.getAddress()+"',"
                    +"'"+paciente.getTelephone() + "','" + paciente.getEmail() + "',"+paciente.getWeight()
                    +","+paciente.getSize()+",'"+paciente.getDisease()+"',"+paciente.getRoomID()+","+paciente.getStatus()+");";
            pst = cn.prepareStatement(query);
            pst.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public Patient patienteSearchbyName(String name) throws SQLException
    {
        Patient patient=null;
          pst = cn.prepareStatement("Select * from paciente where primernombre='"+name+"'");
        rs = pst.executeQuery();
            while (rs.next()) {
            patient=new Patient();
       
            patient.setFirstname(rs.getString("primernombre"));
            patient.setLastname(rs.getString("apellido"));
            patient.setSecurityNumber(rs.getString("nss"));
            patient.setAddress(rs.getString("direccion"));
            patient.setAge(rs.getInt("edad"));
            patient.setTelephone(rs.getString("telefono"));
            patient.setEmail(rs.getString("email"));
            patient.setWeight(rs.getFloat("peso"));
            patient.setSize(rs.getFloat("altura"));
            patient.setDisease(rs.getString("enfermedad"));
            patient.setRoomID(rs.getInt("idcuarto"));
          patient.setStatus(rs.getInt("status"));
            
            
            }
        
        return patient;
    }
    
    
     public Patient patienteSearchbyNumberSec(String nss) throws SQLException
    {
        Patient patient=null;
          pst = cn.prepareStatement("Select * from paciente where nss='"+nss+"'");
        rs = pst.executeQuery();
            while (rs.next()) {
            patient=new Patient();
       
            patient.setFirstname(rs.getString("primernombre"));
            patient.setLastname(rs.getString("apellido"));
            patient.setSecurityNumber(rs.getString("nss"));
            patient.setAddress(rs.getString("direccion"));
            patient.setAge(rs.getInt("edad"));
            patient.setTelephone(rs.getString("telefono"));
            patient.setEmail(rs.getString("email"));
            patient.setWeight(rs.getFloat("peso"));
            patient.setSize(rs.getFloat("altura"));
            patient.setDisease(rs.getString("enfermedad"));
            patient.setRoomID(rs.getInt("idcuarto"));
          patient.setStatus(rs.getInt("status"));
            
            
            }
        
        return patient;
    }
     
      public Patient patienteSearchbyID(String id) throws SQLException
    {
        Patient patient=null;
          pst = cn.prepareStatement("Select * from paciente where Id='"+id+"'");
        rs = pst.executeQuery();
            while (rs.next()) {
            patient=new Patient();
       
            patient.setFirstname(rs.getString("primernombre"));
            patient.setLastname(rs.getString("apellido"));
            patient.setSecurityNumber(rs.getString("nss"));
            patient.setAddress(rs.getString("direccion"));
            patient.setAge(rs.getInt("edad"));
            patient.setTelephone(rs.getString("telefono"));
            patient.setEmail(rs.getString("email"));
            patient.setWeight(rs.getFloat("peso"));
            patient.setSize(rs.getFloat("altura"));
            patient.setDisease(rs.getString("enfermedad"));
            patient.setRoomID(rs.getInt("idcuarto"));
          patient.setStatus(rs.getInt("status"));
            
            
            }
        
        return patient;
    }
}
