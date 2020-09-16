<%-- 
    Document   : CheckearVenta
    Created on : 22-nov-2017, 17:54:13
    Author     : Toragin
--%>

<%@page import="cl.duoc.dej4501.dao.ProductoDaoImp"%>
<%@page import="cl.duoc.dej4501.dao.VentasDaoImp"%>
<%@page import="cl.duoc.dej4501.dto.Detalle_Venta"%>
<%@page import="cl.duoc.dej4501.dao.DetalleVentaImp"%>
<%@page import="java.util.ArrayList"%>
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
      
      
      </li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="CerrarSEssion.jsp"><span class="glyphicon glyphicon-log-in"></span>Cerrar Session</a></li>
    </ul>
  </div>
</nav>
  

    </head>
    <body>
        <form action="/Proyecto/CheckearVentaServlet" method="POST">
            <% ArrayList<Detalle_Venta> lista = new DetalleVentaImp().listarVentas(new VentasDaoImp().SiguienteVenta());if(lista!=null){ 
               if(lista.isEmpty()){ 
                 String mensaje=(String)request.getAttribute("mensaje");
                 out.print("-->"+mensaje);
               }else{ %>
         
            <table border="1">
                <thead>
                    <tr>
                        <th>Producto</th>
                        <th>Cantidad</th>
                        <th>Total</th>
                        
                    </tr>
                </thead>
                <tbody>
                     <% for (Detalle_Venta dto : lista) { %>
                    <tr>
                       <td><%= new ProductoDaoImp().idANombreProducto(dto.getCodigo_producto()) %></td>
                      <td><%= dto.getCantidad() %></td>
                      <td><%= dto.getTotal() %></td>
                      
                  </tr>
               <% } %>      
                    
                    <tr>
                        <td><input type="submit" value="Aceptar" name="btnAceptar" /></td>
                        
                    </tr>
                </tbody>
            </table>
               <% } %>
             <% } %>

            
        </form>
        
    </body>
</html>
