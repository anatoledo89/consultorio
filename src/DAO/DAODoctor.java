/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Doctor;
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
*/
//lo mismo que en DAODoctor...
public class DAODoctor {
  Base_dato bd = new Base_dato();
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;  
    public DAODoctor() throws SQLException, ClassNotFoundException
    {
        //variable conectio se conecta a la base de datos con .connect 
        cn = bd.connect();
    }
    
    
    /**
     * 
     * @param idhospital
     * @return
     * @throws SQLException 
     */
    //funcion de tipo arraylist que regresa los datos de un hospital cuando su 
    //ID es proporcionado :)
      public ArrayList<Doctor> loaddoctors(int idhospital) throws SQLException {
        ArrayList<Doctor> lst = new ArrayList<>();
        Doctor d = null;
        //sintaxiss..
        pst = cn.prepareStatement("Select * from doctor where idhospital="+idhospital+"");
        rs = pst.executeQuery();
        while (rs.next()) {
           d=new Doctor();
           //se usan los sets...
            d.setId(rs.getString("Id"));
            d.setFirstname(rs.getString("primernombre"));
            d.setLastname(rs.getString("apellido"));
            d.setAddress(rs.getString("direccion"));
            d.setAge(rs.getInt("edad"));
            d.setEmail(rs.getString("email"));
            d.setDepartment("departamento");
            d.setLicense(rs.getString("licencia"));
            d.setIdhospital(rs.getInt("idhospital"));
            
            lst.add(d);
        }
        return lst;
    }
      /**
       * 
       * @param doctor
       * @return 
       */
      //funcion alta doctor recibe un doctor y mete los datos en la base de datos
      public boolean alta_doctor(Doctor doctor)
      {
          try
          {
             //nos tomo horas las comitas son imposibles...D:
              //asi es la sintaxis para ingresar los datos de un doctor a la base de datos 
          String query = "Insert into doctor values"
                    + "('" + doctor.getId() + "','" + doctor.getFirstname() + "','" + doctor.getLastname()+ "'"
                    + "," +doctor.getAge() + ",'"
                    + doctor.getAddress() + "','" + doctor.getTelephone() + "','" + doctor.getEmail() + "'" + 
                     ",'" + doctor.getDepartment() + "','" + doctor.getLicense()+"','"+doctor.getIdhospital()+"')";
  pst = cn.prepareStatement(query);
            pst.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAODoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
      }
      
      
      //metodo para eliminar un doctor igual se usa la sintaxis para borrar desde base de datos 
      /**
       * 
       * @param Id
       * @return 
       */
       public int deleteDoctor(String Id)
    {
        //creamos una variable para guardar el borrado
        int rowm=0;
          try {
             String query = "Delete from doctor where Id='"+Id+"'";
             pst = cn.prepareStatement(query);
            rowm= pst.executeUpdate();
             
            
         } catch (SQLException ex) {
             Logger.getLogger(DAOConsultorio.class.getName()).log(Level.SEVERE, null, ex);
         }
         
          return rowm;
    }
       /**
        * 
        * @param doctor
        * @return 
        */
       //funcion que recibe un doctor y le cambia los datos con los get del doctor que recibira 
        public boolean ModifyDoctor(Doctor doctor)
    {
          try {
              //solo obtiene los nuevos datos modificados previamente en la interface
             String query = "Update doctor "+
                     "SET primernombre='"+doctor.getFirstname()+"',"+
                     "apellido ='"+doctor.getLastname()+"',edad= "+doctor.getAge()+","+
                     "direccion= '"+doctor.getAddress()+"', telefono= '"+ doctor.getTelephone()+"',email='"
                     +doctor.getEmail()+"',departamento='"+doctor.getDepartment()+"', licencia='"+doctor.getLicense()+"' "
                     + "where Id="+doctor.getId();
                    
                   
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
         * @param id
         * @return
         * @throws SQLException 
         */
        //funcion que recibe el id de un doctor y regresa los datos que esten 
        //registrados en la base de datos de ese doctor 
        
        public Doctor getDoctor(String id) throws SQLException
                //en caso de que ocurra un error no va a entrar al punto next y el doctor va a ser 
                //null 
    { Doctor doctor = null;
        pst = cn.prepareStatement("Select * from doctor where Id='"+id+"'");
        rs = pst.executeQuery();
        //si el prepare statement esta correcto, osea si si encontro un id similar 
        // entonces va a entrar al next , si entra al next se setean los datos del doctor 
        //cuyo id fue recibido como argumento 
            while (rs.next()) {
           doctor =new Doctor();
           doctor.setId(rs.getString("Id"));
           doctor.setFirstname(rs.getString("primernombre"));
           doctor.setLastname(rs.getString("apellido"));
           doctor.setAge(rs.getInt("edad"));
           doctor.setAddress(rs.getString("direccion"));
           doctor.setTelephone(rs.getString("telefono"));
           doctor.setEmail(rs.getString("email"));
           doctor.setDepartment(rs.getString("departamento"));
           doctor.setLicense(rs.getString("licencia"));
           doctor.setIdhospital(rs.getInt("idhospital"));
        }
        return doctor;
        
    }
        /**
         * 
         * @param idhospital
         * @return
         * @throws SQLException 
         */
        //funcion que recibe el id de un hospital y regresa los datos de ese hospital
        public Hospital gethospitalbyId(int idhospital) throws SQLException {
       
            //ponemos la variable hospital como null en caso de que el id 
            //proporcionado por el usuario no sea encontrado, no va a poder entrar al next
            //si no entra a next entonces hospital h va a ser null 
        Hospital h = null;
        //con esto seleccionamos una tabla hospital de la base de datos con el id del hospital 
        //proporciando por el usuario en caso de que no la encuentre ya no continua 
        pst = cn.prepareStatement("Select * from hospital where Id="+idhospital+"");
        rs = pst.executeQuery();
        while (rs.next()) {
            h = new Hospital();
            //obtenemos los datos de la base de datos y los seteamos en nuestro objeto hospital
            h.setIdhospital(rs.getInt("Id"));
            h.setName(rs.getString("nombre"));
            h.setAddress(rs.getString("direccion"));
            h.setTelephone(rs.getString("telefono"));
            h.setNumOfRooms(rs.getInt("ncuartos"));
            h.setNumOfDoctorsOffices(rs.getInt("noficinas"));
            
            
           
        }
        return h;
    }
        /**
         * 
         * @param id
         * @return
         * @throws SQLException 
         */
        //esta funcion fue hecha para ver si, si hay un id igual en la base de datos
        public int FindID(String id) throws SQLException
        {
            //ponemos un contador
            int cont = 0;
            Doctor doctor = null;
        pst = cn.prepareStatement("Select * from doctor where Id='"+id+"'");
        rs = pst.executeQuery();
        
        //si encuentra un id entonces va a entrar al .next, y si entra al .next 
        //se le suma 1 al contador
        //esta funcion nos regresa el contador, si el contador es 0 entonces no hay un id 
        // igual , ppero si el contador es 1 significa que si encontro un id igual e
        //ingreso al .next
            while (rs.next()) {
                cont++;
            }
      return cont;
        }
}
