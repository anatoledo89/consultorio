/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author pamel
 */
import java.io.File;
import java.sql.*;
public class Base_dato {
    
    
   //Variable conection para conectarse a la base de datos
    /**
     * 
     */
     Connection connection = null;
       
 
        public Connection connect() throws SQLException, ClassNotFoundException
        {
       
       try {
    //        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    //Conexión a access con la librería ucanaccess
 File dbfile=new File("consultorio.accdb");
 String path=dbfile.getAbsolutePath();
          String ruta="jdbc:ucanaccess://"+path;
         
          connection=DriverManager.getConnection(ruta);
          //devolvemos la conexión para usarla en nuestras consultas
            return connection;
 
        }
        catch(SQLException sqlex){
            System.out.println("Error:"+sqlex);
            return null;
        }
       
         
         
        
    }
        
        
}
