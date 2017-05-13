/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Hospital;
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
public class DAOHospital {
    
    Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;

    public DAOHospital() throws SQLException, ClassNotFoundException {
        cn = bd.connect();
    }
    
    public boolean saveHospital(Hospital hospital) {
        try {
            String query = "Insert into hospital(nombre,direccion,telefono,noficinas,ncuartos) values"
                    + "('" + hospital.getName() + "','" + hospital.getAddress() + "'"
                    + ",'" + hospital.getTelephone() + "','"
                    + hospital.getNumOfDoctorsOffices() + "'," + hospital.getNumOfRooms() + ");";
            pst = cn.prepareStatement(query);
            pst.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public ArrayList<Hospital> loadhospital() throws SQLException {
        ArrayList<Hospital> lst = new ArrayList<>();
        Hospital h = null;
        pst = cn.prepareStatement("Select * from hospital");
        rs = pst.executeQuery();
        while (rs.next()) {
            h = new Hospital();
            h.setIdhospital(rs.getInt("Id"));
            h.setName(rs.getString("nombre"));
            h.setAddress(rs.getString("direccion"));
            h.setTelephone(rs.getString("telefono"));
            h.setNumOfRooms(rs.getInt("ncuartos"));
            h.setNumOfDoctorsOffices(rs.getInt("noficinas"));
            
            
            lst.add(h);
        }
        return lst;
    }
    
    public int getRoomID(int idhospital) throws SQLException
    {
        int ncuartos=0;
       
        pst = cn.prepareStatement("Select max(idcuarto) as roomid from cuarto where idhospital="+idhospital+"");
        rs = pst.executeQuery();
            while (rs.next()) {
          ncuartos=rs.getInt("roomid");
        }
        return ncuartos;
    }
}
