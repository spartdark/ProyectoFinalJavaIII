<%-- 
    Document   : index
    Created on : 16/10/2013, 08:51:35 PM
    Author     : T-201
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="estilos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="js/jquery/jquery.js"></script>
        <script src="js/acciones.js"></script>
    </head>
    <body>
        <h1>Insertar usuario</h1>
        <div id="formulario"> 
            <h2>id</h2>
            <input type="text" id="id"/>
            <br>
            <h2> nombre </h2>
            <input type="text" id="nombre"/>
            <br>
            <h2> Sueldo </h2>
            <input type="text" id="sueldo"/>
            <br>
            
            <input type="button" id="guardar" value="guardar"/>
            <div id="resultado"></div>
           
        </div>
    </body>
</html>
