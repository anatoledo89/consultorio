/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Doctor;
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
public class DAODoctor {
  Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;  
    public DAODoctor() throws SQLException, ClassNotFoundException
    {
        cn = bd.connect();
    }
    
    
      public ArrayList<Doctor> loaddoctors() throws SQLException {
        ArrayList<Doctor> lst = new ArrayList<>();
        Doctor d = null;
        pst = cn.prepareStatement("Select * from doctor");
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
      public boolean alta_doctor(Doctor doctor)
      {
          try
          {
              
          String query = "Insert into doctor values"
                    + "('" + doctor.getId() + "','" + doctor.getFirstname() + "','" + doctor.getLastname()+ "'"
                    + "," +doctor.getAge() + ",'"
                    + doctor.getAddress() + "','" + doctor.getTelephone() + "','" + doctor.getEmail() + "'" + 
                     ",'" + doctor.getDepartment() + "','" + doctor.getLicense()+"')";
  pst = cn.prepareStatement(query);
            pst.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAODoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
      }
}
