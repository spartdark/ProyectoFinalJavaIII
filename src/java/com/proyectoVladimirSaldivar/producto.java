/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoVladimirSaldivar;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class producto implements Serializable {
    
@Id
@Column(name="id_cliente")
private int ide;

@Column(name="nombre_producto")
private String nombre;

@Column(name="precio")
private float sueldo;

    public int getId() {
        return ide;
    }

    public void setId(int id) {
        this.ide = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public String toString(){
        String mensaje=null;
        mensaje="El nombre es:"+nombre+" y el sueldo es: "+sueldo+ " es todo...";
        return mensaje;
    }
}

