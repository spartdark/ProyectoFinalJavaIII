/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyectoVladimirSaldivar;

import java.util.List;
import org.hibernate.Query;
 
public class DAOUsuarioImpl extends DAO{
 
       

    public void agregarUsuario(Usuario Usuario) {
    begin();
    getSession().save(Usuario);
    commit();
    DAO.close();
    
    }
 
  
    public List<Usuario> buscarTodosUsuarios() {
        begin();
        Query q = getSession().createQuery("from Usuario");
        List<Usuario> Usuario = (List<Usuario>)q.list();
        commit();
        DAO.close();
         
return Usuario; 
        
      
    }
    
 public void borrarUsuario(Usuario p){
            begin();
             getSession().delete(p);
            commit();
            DAO.close();
 }   
 
  public Usuario buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Usuario where id = :id");
        q.setInteger("id",id);
        Usuario p = (Usuario)q.uniqueResult();
        commit();
        DAO.close();
return p;  
   
    }
 
  

}