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
import java.sql.*;
public class Base_dato {
   
     Connection connection = null;
       
 
        public Connection connect() throws SQLException, ClassNotFoundException
        {
        
            
       
       try {
    //        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    //Conexión a access con la librería ucanaccess
 
          String ruta="jdbc:ucanaccess://C:/Users/A/consultorio.accdb";
         
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
