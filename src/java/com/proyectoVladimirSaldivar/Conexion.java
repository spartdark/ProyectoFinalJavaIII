/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoVladimirSaldivar;

/**
 *
 * @author T-201
 */
import java.sql.*;
public class Conexion {
    public Connection conectarse() throws Exception {
    //escribir la url del servidor de base de datos
        String url ="jdbc:oracle:thin:@localhost:1521:XE";
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection(url,"system","system");
        return con;
}
    
}
