/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.servlet;

import cl.duoc.dej4501.dao.UsuarioDaoImp;
import cl.duoc.dej4501.dto.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Toragin
 */
@WebServlet(name = "ModificarUsuario", urlPatterns = {"/ModificarUsuario"})
public class ModificarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Usuario dto = new Usuario();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dto.setLogin_usuario(request.getParameter("txtNombreLogin").trim());
            dto.setPass_usuario(request.getParameter("txtPassword").trim());
            dto.setNombre_usuario(request.getParameter("txtNombreUsuario").trim());
            dto.setApellido_usuario(request.getParameter("txtApellidoUsuario").trim());
            dto.setCorreo_usuario(request.getParameter("txtCorreo").trim());
            if(request.getParameter("cmbTipoUsuario").equals("Vendedor")){
                dto.setCodigo_perfil(2);
            }else if(request.getParameter("cmbTipoUsuario").equals("Consulta")){
                dto.setCodigo_perfil(1);
            }else if(request.getParameter("cmbTipoUsuario").equals("Administrador")){
                dto.setCodigo_perfil(3);
            }
            dto.setFechaNacimiento_usuario(df.parse(request.getParameter(
                        "txtFechaNacimiento")));
            int codigo = Integer.parseInt(request.getParameter("txtIdUsuario"));
            if(new UsuarioDaoImp().modificarUsuario(codigo, dto)){
            request.setAttribute("mensaje", "Usuario modificado");
            response.sendRedirect("paginas/VentanaMantenerUsuario.jsp");
            }else{             
                request.setAttribute("mensaje", "El usuario no se pudo modificar");
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
