/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoVladimirSaldivar;
import java.sql.*;
import java.util.ArrayList;

public class Testito {

public static void main (String []algo)throws Exception{
    
 DAOUsuarioImpl dao=new DAOUsuarioImpl();
 Usuario u=new Usuario();
 u.setNombre("ana");
 u.setId(4);
 u.setSueldo(1200);
 dao.agregarUsuario(u); 
 System.out.println("Insrtado con exito");
 
DAOProductosImpl1 x=new DAOProductosImpl1();
//x.buscarTodosProductos().get(0).getNombre()      ;
//x.agregarProducto(null);
 /*
 ArrayList<Usuario> usuarios=dao.buscarTodos();
 for(Usuario u:usuarios){
        System.out.println(u);
 }
         */
    }

}