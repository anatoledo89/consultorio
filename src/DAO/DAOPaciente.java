/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Doctor;
import Clases.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
       patient.setPatientID(rs.getInt("Id"));
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
      
        public ArrayList<String> getDepartament() throws SQLException
      {
          ArrayList<String> departamentlist=new ArrayList<>();
          
           try {
          pst = cn.prepareStatement("Select departamento from doctor");
         
             rs = pst.executeQuery();
              while (rs.next()) {
                  departamentlist.add(rs.getString("departamento"));
              
              }
         } catch (SQLException ex) {
             Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
         }
          return departamentlist;
      }
        
        
        public ArrayList<Doctor> loaddoctorsbyDepartment(String departamento) throws SQLException {
        ArrayList<Doctor> lst = new ArrayList<>();
        Doctor d = null;
        pst = cn.prepareStatement("Select * from doctor where departamento='"+departamento+"'");
        rs = pst.executeQuery();
        while (rs.next()) {
           d=new Doctor();
            d.setId(rs.getString("Id"));
            d.setFirstname(rs.getString("primernombre"));
            d.setLastname(rs.getString("apellido"));
            d.setAddress(rs.getString("direccion"));
            d.setAge(rs.getInt("edad"));
            d.setEmail(rs.getString("email"));
            d.setDepartment("departamento");
            d.setLicense(rs.getString("licencia"));
            
            lst.add(d);
        }
        return lst;
    }
        
       public boolean addDoctor(String iddoctor, int iddpatient) 
       {
         try {
             pst = cn.prepareStatement("Insert into paciente doctor(iddoctor,idpaciente) values('"+iddoctor+"',"+iddpatient+")");
              pst.executeUpdate();
              return true;
         } catch (SQLException ex) {
             Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
         }
            
           return false;
       }
        
       
}
