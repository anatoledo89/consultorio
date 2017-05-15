/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Base_dato;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pamel
 */
public class Login {
  
    Base_dato bd=new Base_dato();
   PreparedStatement pst;
   ResultSet rs;
   Connection cn;
    
   /**
    * 
    * @throws SQLException
    * @throws ClassNotFoundException 
    */
    public Login() throws SQLException, ClassNotFoundException
    {
        //Obtenemos la conexión
  cn=bd.connect();
    }
    
    
    //esta es la funcion acceder que recibe un usuario y una contraseña
    /**
     * 
     * @param usuario
     * @param password
     * @return
     * @throws SQLException 
     */
    public Usuario acceder(String usuario,char[] password) throws SQLException
    {
        try {
            //Buscamos en la tabla de usuarios de la base de datos....
            Usuario u=null;
            //en caso de que encuentre un usuario y una password que coincidan.. va a continuar al next
            //si usuarios sera nulo y mas adelante en la ventana interface hay una validacion para
            //que no pueda entrar y que despliege un mensajito :)
            String query="SELECT * FROM usuarios where usuario='"+usuario+"' and password='"+new String(password)+"'";
            pst=cn.prepareStatement(query);
            rs=pst.executeQuery();
            while(rs.next())
            {
                //se le setea la info a ese usuario pero no sera usado mas adelante..
                u=new Usuario();
                u.setIdusuario(rs.getInt("Id"));
                u.setUsuario(rs.getString("usuario"));
                u.setPassword(rs.getString("password"));
                
            }
            //Cerramos la conexión después de obtener lo que queremos
           cn.close();
           //Devolvemos el objeto usuario
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            cn.close();
        } 
        return null;
        
    }
}
