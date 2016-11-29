/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoVladimirSaldivar;

import java.sql.*;
import java.util.ArrayList;
public class DAOUsuario {
   Conexion con;
   
   public DAOUsuario(){
       con=new Conexion();
   }
    
    
    public void insertarUsuario(Usuario u) throws Exception {

        Connection c = con.conectarse();
       CallableStatement calla = c.prepareCall("{Call insert_usuario(?,?,?)}");
       calla.setInt(1,u.getId());
       calla.setString(2,u.getNombre());
       calla.setFloat(3,u.getSueldo());
       calla.executeUpdate();
       calla.close();
       c.close();
       
    }
    /*
    Caso 2)
    */
    public ArrayList<Usuario> buscarTodos() throws Exception{//Modifique 27/nov
        ArrayList <Usuario> usuarios =new ArrayList <Usuario>();
        Usuario u=new Usuario();
         Connection c =con.conectarse();
      Statement st=          c.createStatement();
       ResultSet res=st.executeQuery("select * from usuario1");
        while(res.next()){
             u.setId(res.getInt(1));
             u.setNombre(res.getString(2));
             u.setSueldo(res.getFloat(3));
             usuarios.add(u);
             u=new Usuario();
        }
        
        return usuarios;
    }
    
    
    public Usuario buscarpoId(int id) throws Exception{//Modifique 27/nov
        
        Usuario u=new Usuario();
         Connection c =con.conectarse();
      Statement st=          c.createStatement();
       ResultSet res=st.executeQuery("select * from usuario1 where id="+id);
        while(res.next()){
             u.setId(res.getInt(1));
             u.setNombre(res.getString(2));
             u.setSueldo(res.getFloat(3));
         
        }
        
        return u;
    }
}

