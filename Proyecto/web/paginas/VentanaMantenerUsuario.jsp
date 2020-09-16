<%-- 
    Document   : VentanaMantenerUsuario
    Created on : 26-nov-2017, 21:41:58
    Author     : Toragin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="cl.duoc.dej4501.dao.UsuarioDaoImp"%>
<%@page import="cl.duoc.dej4501.dto.Usuario"%>
<%@page import="cl.duoc.dej4501.dto.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <form action="/Proyecto/BorrarPorId" method="POST">
                <% ArrayList<Usuario> lista = new UsuarioDaoImp().ListarTodosLosUsuarios();if(lista!=null){ 
               if(lista.isEmpty()){ 
                 String mensaje=(String)request.getAttribute("mensaje");
                 out.print("-->"+mensaje);
               }else{ %>
         
            <table border="1">
                <thead>
                    <tr>
                        <th>Id usuario</th>
                        <th>Login usuario</th>
                        <th>Password usuario</th>
                        <th>Nombre usuario</th>
                        <th>Apellido usuario</th>
                        <th>Correo usuario</th>
                        <th>Codigo perfil</th>
                        <th>Fecha de Nacimiento</th>
                        
                        
                        
                    </tr>
                </thead>
                <tbody>
                     <% for (Usuario dto : lista) { %>
                    <tr>
                      
                      <td><%= dto.getId_usuario() %></td>
                      <td><%= dto.getLogin_usuario() %></td>
                      <td><%= dto.getPass_usuario() %></td>
                      <td><%= dto.getNombre_usuario() %></td>
                      <td><%= dto.getApellido_usuario() %></td>
                      <td><%= dto.getCorreo_usuario() %></td>
                      <td><%= dto.getCodigo_perfil() %></td>
                      <td><%= dto.getFechaNacimiento_usuario() %></td>
                  </tr>
               <% } %>      
                    
                    
                </tbody>
            </table>
               <% } %>
             <% } %>
             <br>
             <table border="0">
                 <thead>
                     
                 </thead>
                 <tbody>
                     <tr>
                         <td>Borrar por id</td>
                         <td><input type="text" name="txtBorrarId" value="" /></td>
                     </tr>
                     <tr>
                         <td><input type="submit" value="Borrar" name="btnBorrarId" /></td>
                     </tr>
                     
                 </tbody>
             </table>

             
        </form>
             <form action="/Proyecto/IrAlModificar" method="POST">
                 <table border="0">
                     
                     <tbody>
                         <tr>
                             <td>Modificar usuario por id</td>
                             <td><input type="text" name="txtModificarId" value="" /></td>
                         </tr>
                         <tr>
                             <td><input type="submit" value="Modificar" name="btnModificarId" /></td>
                             <td></td>
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
