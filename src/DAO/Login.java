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
 * @author A
 */
public class Login {
  
    Base_dato bd=new Base_dato();
   PreparedStatement pst;
   ResultSet rs;
   Connection cn;
    
    public Login() throws SQLException, ClassNotFoundException
    {
        //Obtenemos la conexión
  cn=bd.connect();
    }
    
    public Usuario acceder(String usuario,char[] password) throws SQLException
    {
        try {
            //Buscamos en la tabla un usuario que coincida con lo ingresado en la ventana de Interface
            Usuario u=null;
            String query="SELECT * FROM usuarios where usuario='"+usuario+"' and password='"+new String(password)+"'";
            pst=cn.prepareStatement(query);
            rs=pst.executeQuery();
            while(rs.next())
            {
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
