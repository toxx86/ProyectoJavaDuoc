<%-- 
    Document   : RegistroUsuario
    Created on : 13-11-2017, 16:03:37
    Author     : CETECOM
--%>

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
      
        </ul>
      </li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="RegistroUsuario.jsp"><span class="glyphicon glyphicon-user"></span> Registrarse</a></li>
      <li><a href="LoginUsuario.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  

    </head>
    <body>
        <form action="/Proyecto/AgregarUsuario" method="POST">
            <table border="1">               
                <tbody>
                    <tr>
                        <td>Nombre login</td>
                        <td><input type="text" name="txtNombreLogin" value="" requiered /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="txtPassword" value="" requiered  /></td>
                    </tr>
                    <tr>
                        <td>Nombre Usuario</td>
                        <td><input type="text" name="txtNombreUsuario" value="" requiered  /></td>
                    </tr>
                    <tr>
                        <td>Apellido Usuario</td>
                        <td><input type="text" name="txtApellidoUsuario" value="" requiered  /></td>
                    </tr>
                    <tr>
                        <td>correo usuario</td>
                        <td><input type="text" name="txtCorreo" value="" requiered  /></td>
                    </tr>
                    <tr>
                        <td>Tipo usuario</td>
                        <td><select name="cmbTipoUsuario">
                                <option>Consulta</option>
                                <option>Vendedor</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Fecha Nacimiento</td>
                        <td><input type="date" name="txtFechaNacimiento" value="" requiered="se requiere" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Guardar" name="btnGuardar" requiered  /></td>
                    </tr>
                </tbody>
            </table>

        </form>
        <% String mensaje =(String)request.getAttribute("mensaje");
          if(mensaje!=null){ %>
            <script>
                alert("<%= mensaje %>");
            </script>    
        <% } %>  
    </body>
</html>
