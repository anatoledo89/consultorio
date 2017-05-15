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
 * @author pamel
 */
public class DAOReportes {
    
    //variable base de datos para conectar
     Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;  
    /**
     * 
     * 
    */
    /**
     * 
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    //funcion para conector la base de datos 
    public DAOReportes() throws SQLException, ClassNotFoundException
    {  cn = bd.connect();
         
    }
    
  /**
   * 
   * @param idhospital
   * @return
   * @throws SQLException 
   */
    //funcion del tipo arraylist que recibe el id del hospital
    public ArrayList<DoctorsOffice> consultorioclinica(int idhospital) throws SQLException
    {
        // creamos un objeto de doctorsOffice y lo ponemos como nulo.
        DoctorsOffice doffice=null;
        //declaramos un arraylist que se llame lstoffice
        ArrayList<DoctorsOffice> lstdoffice=new ArrayList<>();
        //seleccionamos la infomormacion de los consultorios que estan en el hospital cuyo id fue
        //proporcionado por el usuario
         pst = cn.prepareStatement("SELECT * FROM consultorio where idhospital="+idhospital);
        rs = pst.executeQuery();
        //entra al next en caso de que no entre al next, significa que no encontro el id del hospital en la 
        //base de datos...
        while (rs.next())
        {
            //creamos un objeto del tipo dosctorOffice
          doffice= new DoctorsOffice();
          //y le seteamos toda la informacion con la informacion de la base de datos...
          //asi es la sintaxis
doffice.setFloor(rs.getInt("piso"));
doffice.setLastPayment(rs.getFloat("ultimo_pago"));
doffice.setMonthlyRent(rs.getFloat("renta_mensual"));
doffice.setDoctorID(rs.getString("iddoctor"));
            lstdoffice.add(doffice);
        }
        //regresa un arraylist llamado lstdoffice que fue al que se le asigno todo s los datos de la base de 
        //datos de la tabla consultorio
        return lstdoffice;
        
    }
    
    /**
     * 
     * @param idhospital
     * @return
     * @throws SQLException 
     */
    
    //funcion del tipo arraylist que recibe el id de un hospital
   
   public ArrayList<Doctor> doctorclinica(int idhospital) throws SQLException
    {
        Doctor doctor=null;
        ArrayList<Doctor> listdoctor=new ArrayList<>();
        //selecciona la tabla consultorio que tiene como id el que recibe 
         pst = cn.prepareStatement("SELECT * FROM consultorio where idhospital="+idhospital);
        rs = pst.executeQuery();
        while (rs.next()) {
          doctor= new Doctor();
          //se setean con los datos de la base de datos 
doctor.setFirstname(rs.getString("primernombre"));
doctor.setLastname(rs.getString("apellido"));
doctor.setDepartment(rs.getString("departamento"));
doctor.setLicense(rs.getString("licencia"));
listdoctor.add(doctor);

    }
        return listdoctor;//regresa el arraylist
    }
   
   /**
    * 
    * @param idhospital
    * @return
    * @throws SQLException 
    */
   //funcion que recibe el id del hospital 
   public ArrayList<Room> cuartosclinica(int idhospital) throws SQLException
   {
       Room r=null;
       ArrayList<Room> listroom=new ArrayList<>();
       //selecciona de la base de datos, los datos de cuarto que tiene el hospital
       pst=cn.prepareStatement("Select * from cuarto where idhospital="+idhospital+"");
       rs=pst.executeQuery();
       while(rs.next())
       {
           //se setean con la base de datos 
           r=new Room();
           r.setPatientID(rs.getString("idpaciente"));
           r.setRoomID(rs.getInt("idcuarto"));
           listroom.add(r);
           
           
       }
       //regresa el arraylist con la informacion de los cuartos del hospital cuyo 
       //id fue recibido como argumento 
       return listroom;
       
          }
   
   /**
    * 
    * @param idhospital
    * @return
    * @throws SQLException 
    */
   //funcion del tipo arraylist que recibe el id del hospital y que hace lo mismo que las 
   //anteriores funcciones.. D:::::::::::::::::::::::::.
   public ArrayList<Patient> pacientesclinica(int idhospital) throws SQLException
   {
       Patient patient=null;
        ArrayList<Patient> listpatient=new ArrayList<>();
        //SELECCIONA A LOS PACIENTES QUE TENGAN EL MISMO ID QUE RECIBE LA FUNCION :(
       pst=cn.prepareStatement("Select * from paciente where idhospital="+idhospital+"");
       rs=pst.executeQuery();
       while(rs.next())
       {
           //CON ese boom boom mami siente el seteo intenso
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
       //regresa un arraylist de la list pacientes de la base de datos 
       return listpatient;
       
   }
}


















