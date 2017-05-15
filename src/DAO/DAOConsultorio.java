/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Doctor;
import Clases.DoctorsOffice;
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
public class DAOConsultorio {
   
    //DAO --> DATA OBJECT ACCESS
    //sirve para acceder a la informacion del objeto en la base de datos
    //se crea un objeto del tipo base de datos para poder acceder 
    
     Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;
    //funcion para conectar.
    public DAOConsultorio() throws SQLException, ClassNotFoundException
    {
    cn = bd.connect();
    }
    
    //en esta funcion, usamos la sintaxis para guardar la informacion de un objeto 
    //y la "depositamos" en la base de datos, hacemos un try catch (recomendado por netbeans)
    //esta funcion recibe un objeto consultorio y ya de ahi agarra los datos, todo lo que agarra
    //lo pone en un string para que sea mandado a una funcion que sera guardada en pst
    public boolean saveConsultorio(DoctorsOffice consultorio)
    {
        
         try {
             String query = "Insert into consultorio("+
                     "piso,renta_mensual,iddoctor,ultimo_pago,idhospital)"
                     +"values('"+consultorio.getFloor()+"',"+consultorio.getMonthlyRent()+","+
                     ""+consultorio.getDoctorID()+","+consultorio.getLastPayment()+","+
                     ""+consultorio.getIdhospital()+")";
             pst = cn.prepareStatement(query);
             pst.executeUpdate();
             return true;
                        
             
            
         } catch (SQLException ex) {
             Logger.getLogger(DAOConsultorio.class.getName()).log(Level.SEVERE, null, ex);
         }
         
          return false;
    }
    
    
    /**
     * creamos una funcion del tipo arraylist que recibe el ID de un objeto hospital
     * @param idhospital 
     * @return
     * @throws SQLException 
     */
    public ArrayList<DoctorsOffice> loadDoctorsOfficebyHospital(int idhospital) throws SQLException
    {
        //declaramos un arraylist...
          ArrayList<DoctorsOffice> lst = new ArrayList<>();
          //nulo (recomendado por netbeans)
       DoctorsOffice doctorsoffice = null;
       //y con el preparestatement usamos la sintaxis para jalar datos de la base de datos 
       // seria algo asi= 
       // Seleccionar de la tabla consultorio que esta en la base de datos, la informacion 
       //de todos los consultorios en donde el ID del hospital es dado por el usuario
        pst = cn.prepareStatement("Select * from consultorio where idhospital="+idhospital+"");
        rs = pst.executeQuery();
        //esto sirve para que siga...
        while (rs.next()) {
            //ponemos que la variable declarada previamente es un nuevo objeto...
           
           doctorsoffice=new DoctorsOffice();
           doctorsoffice.setId(rs.getInt("Id"));
           doctorsoffice.setFloor(rs.getInt("piso"));
           doctorsoffice.setMonthlyRent(rs.getFloat("renta_mensual"));
           doctorsoffice.setLastPayment(rs.getFloat("ultimo_pago"));
           doctorsoffice.setIdhospital(rs.getInt("idhospital"));
            
           //con add agregamos todos la info de doctoroffice  y se la pasamos a lst
            lst.add(doctorsoffice);
        }
        //y esto regresara un arraylist de doctorsoffice wuu
        return lst;
        
        
    }
    /**
     * 
     * @param iddoctorsoffice
     * @return 
     */
    //funcion para borrar un doctor igual desde la base de datos
    public boolean deleteDoctorsOffice(int iddoctorsoffice)
    {
          try {
              //borrar el consultorio con id dado por el usuario
             String query = "Delete from consultorio where Id="+iddoctorsoffice+"";
             pst = cn.prepareStatement(query);
             pst.executeUpdate();
             return true;
                        
             
            
         } catch (SQLException ex) {
             Logger.getLogger(DAOConsultorio.class.getName()).log(Level.SEVERE, null, ex);
         }
         
          return false;
    }
    
    /**
     * 
     * @param iddoctorsoffice
     * @return
     * @throws SQLException 
     */
    //con esto vamos a obtener toda la informacion de un consultorio mandandole 
    //como argumento un id
    public DoctorsOffice getDoctorsOffice(int iddoctorsoffice) throws SQLException
    { DoctorsOffice doctorsoffice = null;
    //sintaxis ya predeterminada...
        pst = cn.prepareStatement("Select * from consultorio where Id="+iddoctorsoffice+"");
        rs = pst.executeQuery();
            while (rs.next()) {
                //sets...
           doctorsoffice=new DoctorsOffice();
           doctorsoffice.setId(rs.getInt("Id"));
           doctorsoffice.setFloor(rs.getInt("piso"));
           doctorsoffice.setMonthlyRent(rs.getFloat("renta_mensual"));
           doctorsoffice.setLastPayment(rs.getFloat("ultimo_pago"));
           doctorsoffice.setIdhospital(rs.getInt("idhospital"));
           doctorsoffice.setDoctorID(rs.getString("iddoctor"));
        }
            //regresa el objeto consultorio ya con todos sus datos :D
        return doctorsoffice;
        
    }
    
    
    /**
     * 
     * @param iddoctor
     * @return
     * @throws SQLException 
     */
    //Esto esta mal ubicado me acabo de dar cuenta...
    //esto va en DAODoctor......................
    //Recibe el id de un doctor y regresa la info de ese id 
     public Doctor getDoctorById(String iddoctor) throws SQLException
    { Doctor d= null;
        pst = cn.prepareStatement("Select * from doctor where Id='"+iddoctor+"'");
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
            d.setIdhospital(rs.getInt("idhospital"));
            }
        return d;
        
        
    }
    
     /**
      * 
      * @param consultorio
      * @return 
      */
     //esto sirve para cambiar los datos desde el programa para la base de datos
    public boolean UpdateDoctorsOffice(DoctorsOffice consultorio)
    {
          try {
              //sintaxis...
              //solo 1 set, recibe a un consultorio como argumento, y usa los get para obtener la 
              //informacion y esa info se la pone a los sets 
             String query = "Update consultorio "+
                     "set piso="+consultorio.getFloor()+",renta_mensual="+consultorio.getMonthlyRent()+","+
                     "iddoctor="+consultorio.getDoctorID()+",ultimo_pago="+consultorio.getLastPayment()+","+
                     "idhospital="+consultorio.getIdhospital()+" where Id="+consultorio.getId()+"";
                   
             pst = cn.prepareStatement(query);
             pst.executeUpdate();
             return true;
                        
             
            
         } catch (SQLException ex) {
             Logger.getLogger(DAOConsultorio.class.getName()).log(Level.SEVERE, null, ex);
         }
         
          return false;
    }
}
