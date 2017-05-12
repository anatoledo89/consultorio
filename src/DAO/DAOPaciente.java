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
}
