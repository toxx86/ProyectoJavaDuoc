<%-- 
    Document   : AgregarVenta
    Created on : 20-11-2017, 15:57:53
    Author     : CETECOM
--%>

<%@page import="java.time.LocalDateTime"%>

<%@page import="java.sql.Date"%>
<%@page import="cl.duoc.dej4501.dto.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Usuario user = (Usuario)session.getAttribute("Usuario"); %>
    <% int codigo = user.getId_usuario(); %>
    <% LocalDateTime fecha = LocalDateTime.now(); %>
    <% System.out.println(user); %>
<html>
    
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
      
      
      </li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="CerrarSession.jsp"><span class="glyphicon glyphicon-log-in"></span>Cerrar Session</a></li>
    </ul>
  </div>
</nav>
  

    </head>
    <body>
        <form action="/Proyecto/AgregarVentaServlet" method="POST">
            <table border="1">                
                <tbody>
                    
                    <tr>
                        <td>Codigo Vendedor</td>
                        <td><input type="text" name="txtCodigoVendedor" value="<%=user.getId_usuario() %>" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>Fecha</td>
                        <td><%=fecha  %></td>
                    </tr>
                    
                </tbody>
                <br>
                <input type="submit" value="Siguiente" name="btnSiguiente" />
            </table>

        </form>
    </body>
</html>
