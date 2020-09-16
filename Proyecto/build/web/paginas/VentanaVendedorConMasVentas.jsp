<%-- 
    Document   : VentanaVendedorConMasVentas
    Created on : 26-nov-2017, 18:27:36
    Author     : Toragin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="cl.duoc.dej4501.dao.VentasDaoImp"%>
<%@page import="cl.duoc.dej4501.dto.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
      
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Consultas <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="VentanaTipoDeProductoMasVendido.jsp">Producto mas vendido</a></li>
          <li><a href="VentanaVendedorConMasVentas.jsp">Vendedor Con mas Ventas</a></li>
          
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
        <form action="VendedorConMasVentas" method="POST">
            <% ArrayList<Usuario> lista = new VentasDaoImp().ListarVendedorConMasVentas(new VentasDaoImp().codigoVendedorConMasVentas());if(lista!=null){ 
               if(lista.isEmpty()){ 
                 String mensaje=(String)request.getAttribute("mensaje");
                 out.print("-->"+mensaje);
               }else{ %>
         
            <table border="1">
                <thead>
                    <tr>
                        <th>Id Usuario</th>
                        <th>Nombre usuario</th>
                        <th>Apellido usuario</th>
                        <th>Correo usuario</th>
                        
                        
                    </tr>
                </thead>
                <tbody>
                     <% for (Usuario dto : lista) { %>
                    <tr>
                      <td><%= dto.getId_usuario() %></td>
                      <td><%= dto.getNombre_usuario() %></td>
                      <td><%= dto.getApellido_usuario() %></td>
                      <td><%= dto.getCorreo_usuario() %></td>
                      
                  </tr>
               <% } %>      
                    
                    
                </tbody>
            </table>
               <% } %>
             <% } %>
        </form>
       
    </body>
</html>
