<%-- 
    Document   : Vendedor
    Created on : 15-11-2017, 14:47:55
    Author     : CETECOM
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="cl.duoc.dej4501.dto.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% Usuario user = (Usuario)session.getAttribute("Usuario"); %>
    <% LocalDateTime fecha = LocalDateTime.now(); %>
    
    
    <head>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">VendoTodo</a>
    </div>
    <ul class="nav navbar-nav">
      
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Ventas <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="AgregarVenta.jsp">Realizar Venta</a></li>
          
        </ul>
      </li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="CerrarSession.jsp"><span class="glyphicon glyphicon-log-in"></span>Cerrar Session</a></li>
    </ul>
  </div>
</nav>
  

    </head>
    <body>
        <h1>Bienvenido <%=user.getNombre_usuario() %> son las <%= fecha %></h1>
        <% String mensaje =(String)request.getAttribute("mensaje");
          if(mensaje!=null){ %>
            <script>
                alert("<%= mensaje %>");
            </script>    
        <% } %>  
    </body>
</html>
