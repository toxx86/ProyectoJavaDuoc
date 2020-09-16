<%-- 
    Document   : CerrarSession
    Created on : 27-nov-2017, 0:10:10
    Author     : Toragin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% response.setHeader("Refresh", "2;url=LoginUsuario.jsp"); %>
    
     <% session.invalidate();  %>
</html>
