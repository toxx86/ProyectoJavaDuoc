<%-- 
    Document   : AgregarItem
    Created on : 20-11-2017, 15:23:40
    Author     : CETECOM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="lista" class="cl.duoc.dej4501.dao.ProductoDaoImp"/>

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
      
      <li><a href="CerrarSession.jsp"><span class="glyphicon glyphicon-log-in"></span>Cerrar Session</a></li>
      
    </ul>
  </div>
</nav>
  

    </head>
    <body>
        <form action="/Proyecto/AgregarDetalleVenta" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Producto</td>
                        <td><select name="cmbProducto">
                                <c:forEach var="producto" items="${lista.listarProducto()}">
                                    <option><c:out value="${producto}"/> </option>
                                </c:forEach>  
                            </select></td>
                    </tr>
                    <tr>
                        <td>Cantidad</td>
                        <td><input type="text" name="txtCantidad" value="" requiered /></td>
                        
                    </tr>
                    <tr>
                        <td><input type="submit" value="Agregar" name="btnAgregar" /></td>
                        <td></td>
                        
                    </tr>
                </tbody>
            </table>

        </form>
        <form action="/Proyecto/Siguiente" method="POST">
            <table border="1">
                
                <tbody>
                    
                    <tr>
                        <td><input type="submit" value="siguiente" name="btnSiguiente" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
        
    </body>
</html>
