<%-- 
    Document   : leer
    Created on : 27/11/2013, 09:13:53 PM
    Author     : T-201
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Conexion.Usuario"%>
<%@page import="Conexion.DAOUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DAOUsuario</h1>
           <%
              
               /*int x=2;
               int y=5;
               int z=x+y;
            out.println("Hola mundo"+z);*/
            DAOUsuario dao=new DAOUsuario();
 ArrayList<Usuario> usuarios=dao.buscarTodos();
 for(Usuario u:usuarios){
   
        out.println(u);
       
 }
            
            %>
    </body>
</html>
