<%-- 
    Document   : VentanaModificarUsuario
    Created on : 26-nov-2017, 22:45:16
    Author     : Toragin
--%>

<%@page import="cl.duoc.dej4501.dto.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% Usuario user = (Usuario)session.getAttribute("modi"); %>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">VendoTodo</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Consulta <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="VentanaTipoDeProductoMasVendido.jsp">Producto mas vendido</a></li>
          <li><a href="VentanaVendedorConMasVentas.jsp">Vendedor Con mas Ventas</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Ventas <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="AgregarVenta.jsp">Realizar Venta</a></li>
          
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Mantenedor <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="VentanaMantenerUsuario.jsp">Mantener Usuario</a></li>
          
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
        <form action="/Proyecto/ModificarUsuario" method="POST">
             <table border="1">               
                <tbody>
                    <tr>
                        <td>Id usuario</td>
                        <td><input type="text" name="txtIdUsuario" value="<%= user.getId_usuario()  %>" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>Nombre login</td>
                        <td><input type="text" name="txtNombreLogin" value="<%= user.getNombre_usuario()  %>" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="txtPassword" value="<%= user.getPass_usuario()  %>" /></td>
                    </tr>
                    <tr>
                        <td>Nombre Usuario</td>
                        <td><input type="text" name="txtNombreUsuario" value="<%= user.getNombre_usuario() %>" /></td>
                    </tr>
                    <tr>
                        <td>Apellido Usuario</td>
                        <td><input type="text" name="txtApellidoUsuario" value="<%= user.getApellido_usuario()  %>" /></td>
                    </tr>
                    <tr>
                        <td>correo usuario</td>
                        <td><input type="text" name="txtCorreo" value="<%= user.getCorreo_usuario() %>" /></td>
                    </tr>
                    <tr>
                        <td>Tipo usuario</td>
                        <td><select name="cmbTipoUsuario">
                                <option>Consulta</option>
                                <option>Vendedor</option>
                                <option>Administrador</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Fecha Nacimiento</td>
                        <td><input type="date" name="txtFechaNacimiento" value="<%= user.getFechaNacimiento_usuario() %>" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Guardar" name="btnGuardar" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
