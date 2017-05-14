/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Doctor;
import Clases.DoctorsOffice;
import Clases.Patient;
import Clases.Room;
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
doffice.setFloor(rs.getInt("piso"));
doffice.setLastPayment(rs.getFloat("ultimo_pago"));
doffice.setMonthlyRent(rs.getFloat("renta_mensual"));
doffice.setDoctorID(rs.getString("iddoctor"));
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
   
   public ArrayList<Room> cuartosclinica(int idhospital) throws SQLException
   {
       Room r=null;
       ArrayList<Room> listroom=new ArrayList<>();
       pst=cn.prepareStatement("Select * from cuarto where idhospital="+idhospital+"");
       rs=pst.executeQuery();
       while(rs.next())
       {
           r=new Room();
           r.setPatientID(rs.getString("idpaciente"));
           r.setRoomID(rs.getInt("idcuarto"));
           listroom.add(r);
           
           
       }
       return listroom;
       
          }
   
   public ArrayList<Patient> pacientesclinica(int idhospital) throws SQLException
   {
       Patient patient=null;
        ArrayList<Patient> listpatient=new ArrayList<>();
       pst=cn.prepareStatement("Select * from paciente where idhospital="+idhospital+"");
       rs=pst.executeQuery();
       while(rs.next())
       {
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
          patient.setRoomID(rs.getInt("idcuarto"));
         
           listpatient.add(patient);
           
       }
       return listpatient;
       
   }
}
