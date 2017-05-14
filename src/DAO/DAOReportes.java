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

/**
 *
 * @author A
 */
public class DAOReportes {
    
     Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;  
    public DAOReportes() throws SQLException, ClassNotFoundException
    {  cn = bd.connect();
         
    }
    
    
    public ArrayList<DoctorsOffice> consultorioclinica(int idhospital) throws SQLException
    {
        DoctorsOffice doffice=null;
        ArrayList<DoctorsOffice> lstdoffice=new ArrayList<>();
         pst = cn.prepareStatement("SELECT * FROM consultorio where idhospital="+idhospital);
        rs = pst.executeQuery();
        while (rs.next()) {
          doffice= new DoctorsOffice();
doffice.setFloor(rs.getInt(""));
doffice.setLastPayment(rs.getFloat("ultimo_pago"));
doffice.setMonthlyRent(rs.getFloat("renta_mensual"));
doffice.setDoctorID(rs.getString("doctorid"));
            lstdoffice.add(doffice);
        }
        return lstdoffice;
        
    }
    
    
   public ArrayList<Doctor> doctorclinica(int idhospital) throws SQLException
    {
        Doctor doctor=null;
        ArrayList<Doctor> listdoctor=new ArrayList<>();
         pst = cn.prepareStatement("SELECT * FROM consultorio where idhospital="+idhospital);
        rs = pst.executeQuery();
        while (rs.next()) {
          doctor= new Doctor();
doctor.setFirstname(rs.getString("primernombre"));
doctor.setLastname(rs.getString("apellido"));
doctor.setDepartment(rs.getString("departamento"));
doctor.setLicense(rs.getString("licencia"));
listdoctor.add(doctor);

    }
        return listdoctor;
    }
}
