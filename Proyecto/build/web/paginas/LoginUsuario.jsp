<%-- 
    Document   : LoginUsuario
    Created on : 15-11-2017, 14:41:15
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
        <form action="/Proyecto/LogearUsuario" method="POST">
            <table border="1">
                
                <tbody>
                    <tr>
                        <td>Nombre Usuario</td>
                        <td><input type="text" name="txtNombreUsuario" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="txtPassword" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Iniciar" name="btnIniciar" /></td>
                       
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
