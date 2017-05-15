/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Doctor;
import Clases.Patient;
import Clases.PatientDoctor;
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
public class DAOPaciente {
    //conexion a la base de datos
     Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;  
    /**
     * 
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    //funcion para conectar...
    public DAOPaciente() throws SQLException, ClassNotFoundException
    {
        cn = bd.connect();
    }
    /**
     * 
     * @param paciente
     * @return 
     */
    //ingresa a un paciente a la base de datos, recibe a un objeto paciente
    public boolean insertPacient(Patient paciente)
    {
        try {
            //sintaxis para ingresar a un paciente recibiendo un objeto paciente
            //se tiene que poner exactamente como esta en la tabla de la base de datos
            String query = "Insert into paciente(nss,primernombre,apellido,edad,direccion,telefono,email,"+
                    "peso,altura,enfermedad,idcuarto,status,idhospital) values"
                    + "('" + paciente.getSecurityNumber() + "','" + paciente.getFirstname() + "'"
                    + ",'" + paciente.getLastname() + "',"+paciente.getAge()+",'"+paciente.getAddress()+"',"
                    +"'"+paciente.getTelephone() + "','" + paciente.getEmail() + "',"+paciente.getWeight()
                    +","+paciente.getSize()+",'"+paciente.getDisease()+"',"+paciente.getRoomID()+","+paciente.getStatus()
                    +","+paciente.getHospitalID()+")";
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
     * @param name
     * @return
     * @throws SQLException 
     */
    //funcion que encuentra a un paciente por su nombre y regresa al paciente con todos sus datos 
    public Patient patienteSearchbyName(String name) throws SQLException
    {
        Patient patient=null;
        //sintaxis que selecciona a un paciente de la base de datos, en caso de que encuentre
        //al nombre recibido como argummento
          pst = cn.prepareStatement("Select * from paciente where primernombre='"+name+"'");
        rs = pst.executeQuery();
            while (rs.next()) {
            patient=new Patient();
            //se usan los set del paciente para que regrese al objeto paciente ya con
            //todos los datos obtenidos de la base de datos
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
           patient.setHospitalID(rs.getInt("idhospital"));
          patient.setRoomID(rs.getInt("idcuarto"));
            
            
            }
        
        return patient;
    }
    
    /**
     * 
     * @param nss
     * @return
     * @throws SQLException 
     */
    //busqueda de un paciente por su numero de ss, se le manda un numero de seguro social
    //lo busca en la base de datos y regresa al pacientte con sus datos
     public Patient patienteSearchbyNumberSec(String nss) throws SQLException
    {
        Patient patient=null;
        //selecciona a un paciente que tenga el mismo numero de seguro social, que el 
        //que esta recibiendo como argumento 
          pst = cn.prepareStatement("Select * from paciente where nss='"+nss+"'");
        rs = pst.executeQuery();
        //entra al next para empezar a setear todos las datos de la base de datos
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
           patient.setHospitalID(rs.getInt("idhospital"));
          patient.setRoomID(rs.getInt("idcuarto"));
            
            
            }
        
        return patient;
    }
     
     /**
      * 
      * @param id
      * @return
      * @throws SQLException 
      */
     //busqueda de paciente por ID, recibe un id y regresa un objeto tipo paciente
     //con todos sus atributos
      public Patient patienteSearchbyID(int id) throws SQLException
    {
        Patient patient=null;
        //selecciona a un paciente que tenga el mismo id, si lo encuentra procede al next 
          pst = cn.prepareStatement("Select * from paciente where Id="+id+"");
        rs = pst.executeQuery();
        //si encuentra un id entonces procede a los sets
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
          patient.setHospitalID(rs.getInt("idhospital"));
          patient.setRoomID(rs.getInt("idcuarto"));
            
            
            }
        //regresa un objeto tipo paciente ya con todos sus datos
        return patient;
    }
      /**
       * 
       * @param idhospital
       * @return
       * @throws SQLException 
       */
      //funcion tipo arraylist que reibe un id de un hospital, y regresa 
      //en una lista todos los departamentos que hay en ese hospital 
        public ArrayList<String> getDepartament(int idhospital) throws SQLException
      {
          ArrayList<String> departamentlist=new ArrayList<>();
          
           try {
          pst = cn.prepareStatement("Select departamento from doctor where idhospital="+idhospital+"");
         
             rs = pst.executeQuery();
              while (rs.next()) {
                  departamentlist.add(rs.getString("departamento"));
              
              }
         } catch (SQLException ex) {
             Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
         }
          return departamentlist;
      }
        /**
         * 
         * @param departamento
         * @param idhospital
         * @return
         * @throws SQLException 
         */
        //recibe un departamento y un id de un hospital y regresa en un arraylist los datos del 
        //doctor con dicho departamento y dicho id de hospital
        public ArrayList<Doctor> loaddoctorsbyDepartment(String departamento, int idhospital) throws SQLException {
        ArrayList<Doctor> lst = new ArrayList<>();
        Doctor d = null;
        pst = cn.prepareStatement("Select * from doctor where departamento='"+departamento+"' and idhospital="+idhospital+"");
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
        /**
         * 
         * @param iddoctor
         * @param nss
         * @param status
         * @param idpaciente
         * @param idhospital
         * @param idcuarto
         * @return 
         */
        //funcion para añadir un doctor a un paciente
       public boolean addDoctor(String iddoctor, String nss, int status,int idpaciente,int idhospital, int idcuarto) 
       {
         try {
             pst = cn.prepareStatement("Insert into pacientedoctor(iddoctor,nss) values('"+iddoctor+"','"+nss+"');");
              pst.executeUpdate();
              pst=cn.prepareStatement("Update paciente set status="+status+" where nss='"+nss+"';");
              pst.executeUpdate();
               pst=cn.prepareStatement("Insert into cuarto(idpaciente,idhospital,idcuarto) values"
                       +"("+idpaciente+","+idhospital+","+idcuarto+")");
              pst.executeUpdate();
              return true;
         } catch (SQLException ex) {
             Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
         }
            
           return false;
       }
       
       /**
        * 
        * @param nss
        * @param idpaciente
        * @return 
        */
       //recibe un ss y un id 
       
       public int removeDoctor(String nss, int idpaciente)
       {
           int row=0;
           try {
               //borra al doctor de la lista de doctores de dicho paciente, solo en caso de que
               //su estatus sea dado de alta
             pst = cn.prepareStatement("Delete from pacientedoctor where nss='"+nss+";");
      row=        pst.executeUpdate();
      //y tambien se libera el cuarto
      pst = cn.prepareStatement("Delete from cuarto where idpaciente='"+idpaciente+"';");
      row=        pst.executeUpdate();
             
             
         } catch (SQLException ex) {
             Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
         }
             return row;
           
       }
       /**
        * 
        * @param nss
        * @return
        * @throws SQLException 
        */
       //funcion que recibe un ss y regresa una arraylist con los datos de los doctores 
       public ArrayList<Doctor> getDoctorsPatientid(String nss) throws SQLException
       {
            ArrayList<Doctor> lst = new ArrayList<>();
        Doctor d = null;
        pst = cn.prepareStatement("Select iddoctor,primernombre,apellido,departamento from pacientedoctor "+
                "inner join doctor on doctor.Id=pacientedoctor.iddoctor where nss='"+nss+"'");
        rs = pst.executeQuery();
        while (rs.next()) {
           d=new Doctor();
            d.setId(rs.getString("iddoctor"));
            d.setFirstname(rs.getString("primernombre"));
            d.setLastname(rs.getString("apellido"));
            d.setDepartment(rs.getString("departamento"));
      
        
            
            lst.add(d);
        }
        return lst;
           
       }
       /**
        * 
        * @param nss
        * @return
        * @throws SQLException 
        */
       //funcion que recibe un ss y regresa lo datos del doctor 
       //
         public Doctor getDoctorPatientid(String nss) throws SQLException
       {
          
        Doctor d = null;
        pst = cn.prepareStatement("Select iddoctor,primernombre,apellido,departamento from pacientedoctor "+
                "inner join doctor on doctor.Id=pacientedoctor.iddoctor where nss='"+nss+"'");
        rs = pst.executeQuery();
        while (rs.next()) {
           d=new Doctor();
            d.setId(rs.getString("iddoctor"));
            d.setFirstname(rs.getString("primernombre"));
            d.setLastname(rs.getString("apellido"));
            d.setDepartment(rs.getString("departamento"));
      
        
            
           
        }
        return d;
           
       }
         /**
          * 
          * @return
          * @throws SQLException 
          */
         //esto nos genera error falta checarl...
         public ArrayList<PatientDoctor> getPatientInfo() throws SQLException
         {
             ArrayList<PatientDoctor> pdlist=new ArrayList<>();
             PatientDoctor pd=null;
              pst = cn.prepareStatement("Select nss,primernombre,apellido,edad,direccion,telefono,email,peso,altura,enfermedad,"+
                      "idcuarto,iddoctor from paciente "+
                "inner join pacientedoctor on paciente.nss=pacientedoctor.nss");
              rs = pst.executeQuery();
        while (rs.next()) {
        pd=new PatientDoctor();
        pd.setFirstname(rs.getString("primernombre"));
        pd.setLastname(rs.getString("apellido"));
        pd.setAddress(rs.getString("direccion"));
      pd.setAge(rs.getInt("edad"));
      pd.setTel(rs.getString("telefono"));
        pd.setEmail(rs.getString("email"));
        pd.setSecurityNumber("nss");
        pd.setRoomid(rs.getInt("idcuarto"));
        pd.setSize(rs.getString("altura"));
        pd.setWeight(rs.getString("peso"));
        pd.setDisease(rs.getString("enfermedad"));
        pd.setIddoctor(rs.getString("iddoctor"));
        pdlist.add(pd);
        
      
        
            
           
        }
        return pdlist;
         }
       /**
        * 
        * @param p
        * @param doctorid
        * @return 
        */
         /**
          * 
          * @param p
          * @param doctorid
          * @return 
          */
         //recibe un objeto paciente y un id de doctor 
       public boolean updatePatient(Patient p, String doctorid) 
       {
         try {
             //esto es para cambiar los datos del paciente
             String query = "Update paciente "+
                     //se pone solo un set para cambiar los datos del objeto paciente 
                     //en los sets se pone los get del paciente
                     "SET enfermedad='"+p.getDisease()+"',"+
                     "peso ="+p.getWeight()+",idcuarto= "+p.getRoomID()+","+
                     "altura= "+p.getSize()+",status='"+p.getStatus()+"'"
                     + " where nss='"+p.getSecurityNumber()+"'";
             
             
             pst = cn.prepareStatement(query);
             pst.executeUpdate();
             
           
               String query2 = "Update pacientedoctor "+
                     "SET iddoctor='"+doctorid+"' where nss='"+p.getSecurityNumber()+"'";
               pst = cn.prepareStatement(query2);
             pst.executeUpdate();
                     
             return true;
         } catch (SQLException ex) {
             Logger.getLogger(DAOPaciente.class.getName()).log(Level.SEVERE, null, ex);
         }
       return false;
       }
        /**
         * 
         * @param nss
         * @param idpaciente
         * @return 
         */
       //con esto borramos un paciente, recibiendo su numero de seguridad social y su 
      
       public boolean deletePatient(String nss,int idpaciente)
       {
          
          try {
              //borramos al paciente de la tabla pacientes de la base de datos dependiendo su numero 
              //de seguro social 
             String query = "Delete from paciente where nss="+nss+"";
             pst = cn.prepareStatement(query);
            pst.executeUpdate();
            //y tambien borramos el cuarto en donde esta hospedado el paciente dependiendo su id
             pst = cn.prepareStatement("Delete from cuarto where idpaciente='"+idpaciente+"';");
           pst.executeUpdate();
             return true;
                        
             
            
         } catch (SQLException ex) {
             Logger.getLogger(DAOConsultorio.class.getName()).log(Level.SEVERE, null, ex);
         
             return false;
       }
       
         
       }
       
}
