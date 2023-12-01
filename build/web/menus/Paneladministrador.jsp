<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel del Administrador</title>
    </head>
    <body>
        <div><h1>Tienda Lacteos</h1></div>
        <%-- Directiva Page --%>
        <c:set var="Usuario" value="${param.Usuario}" />
        <div><h2><strong>Bienvenido, <c:out value=" ${Usuario} "/> !</strong></h2></div>
        
        <%-- Directiva Include --%>
        <div><h3>Men&uacute; de opciones</h3></div>
        <div>
            <%@include file="MenuAdministrador.jsp" %>
        </div>
        <div>            
            <%@include file="Footer.html" %>
        </div>  
    </body>
</html>
