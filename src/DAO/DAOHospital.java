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
 * @author pamel
 */
/**
 * 
 * @author pamel
 */
public class DAOHospital {
    //lo mismo que en DAODoctor
    Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;

    /**
     * 
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    //funcion para conectar la base de datos
    public DAOHospital() throws SQLException, ClassNotFoundException {
        cn = bd.connect();
    }
    
    /**
     * 
     * @param hospital
     * @return 
     */
    //recibe un hospital y guarda sus datos en la base de datos con la sintaxis
    //se le pone ´´ en caso de que sea string
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
    
    /**
     * 
     * @return
     * @throws SQLException 
     */
    //esta funcion carga los datos de un hospital dentro de un arraylist
    //y regresar el arraylist ya con los datos del hospital
    public ArrayList<Hospital> loadhospital() throws SQLException {
        ArrayList<Hospital> lst = new ArrayList<>();
        Hospital h = null;
        pst = cn.prepareStatement("Select * from hospital");
        rs = pst.executeQuery();
        while (rs.next()) {
            //la variable h usada se setea con lo datos de la base de datos 
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
    
    /**
     * 
     * @param idhospital
     * @return
     * @throws SQLException 
     */
    //selecciona el numero maximo de los id's ya que estos se autoincrementan de la tabla cuartos
    //con el hospital id proporcionado
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
