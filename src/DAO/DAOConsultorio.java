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
 * @author A
 */
public class DAOConsultorio {
   
     Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;
    public DAOConsultorio() throws SQLException, ClassNotFoundException
    {
    cn = bd.connect();
    }
    
    
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
    
    
    
    public ArrayList<DoctorsOffice> loadDoctorsOfficebyHospital(int idhospital) throws SQLException
    {
          ArrayList<DoctorsOffice> lst = new ArrayList<>();
       DoctorsOffice doctorsoffice = null;
        pst = cn.prepareStatement("Select * from consultorio where idhospital="+idhospital+"");
        rs = pst.executeQuery();
        while (rs.next()) {
           doctorsoffice=new DoctorsOffice();
           doctorsoffice.setId(rs.getInt("Id"));
           doctorsoffice.setFloor(rs.getInt("piso"));
           doctorsoffice.setMonthlyRent(rs.getFloat("renta_mensual"));
           doctorsoffice.setLastPayment(rs.getFloat("ultimo_pago"));
           doctorsoffice.setIdhospital(rs.getInt("idhospital"));
            
            lst.add(doctorsoffice);
        }
        return lst;
        
    }
    
    public boolean deleteDoctorsOffice(int iddoctorsoffice)
    {
          try {
             String query = "Delete from consultorio where Id="+iddoctorsoffice+"";
             pst = cn.prepareStatement(query);
             pst.executeUpdate();
             return true;
                        
             
            
         } catch (SQLException ex) {
             Logger.getLogger(DAOConsultorio.class.getName()).log(Level.SEVERE, null, ex);
         }
         
          return false;
    }
    
    
    public DoctorsOffice getDoctorsOffice(int iddoctorsoffice) throws SQLException
    { DoctorsOffice doctorsoffice = null;
        pst = cn.prepareStatement("Select * from consultorio where Id="+iddoctorsoffice+"");
        rs = pst.executeQuery();
            while (rs.next()) {
           doctorsoffice=new DoctorsOffice();
           doctorsoffice.setId(rs.getInt("Id"));
           doctorsoffice.setFloor(rs.getInt("piso"));
           doctorsoffice.setMonthlyRent(rs.getFloat("renta_mensual"));
           doctorsoffice.setLastPayment(rs.getFloat("ultimo_pago"));
           doctorsoffice.setIdhospital(rs.getInt("idhospital"));
           doctorsoffice.setDoctorID(rs.getString("iddoctor"));
        }
        return doctorsoffice;
        
    }
    
    
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
    
    public boolean UpdateDoctorsOffice(DoctorsOffice consultorio)
    {
          try {
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
