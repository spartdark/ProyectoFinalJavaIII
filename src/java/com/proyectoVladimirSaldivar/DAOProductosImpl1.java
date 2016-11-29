/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyectoVladimirSaldivar;

import java.util.List;
import org.hibernate.Query;
 
public class DAOProductosImpl1 extends DAO{
 
       

    public void agregarProducto(producto producto) {
    begin();
    getSession().save(producto);
    commit();
    DAO.close();
    
    }
 
  
    public List<producto> buscarTodosProductos() {
        begin();
        Query q = getSession().createQuery("from producto");
        List<producto> producto = (List<producto>)q.list();
        commit();
        DAO.close();
         
return producto; 
        
      
    }
    
 public void borrarproducto(producto p){
            begin();
             getSession().delete(p);
            commit();
            DAO.close();
 }   
 
  public producto buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from producto where id = :id");
        q.setInteger("id",id);
        producto p = (producto)q.uniqueResult();
        commit();
        DAO.close();
return p;  
   
    }
 
  

}