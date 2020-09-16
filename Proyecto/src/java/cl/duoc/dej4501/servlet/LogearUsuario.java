/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cl.duoc.dej4501.dao.UsuarioDaoImp;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CETECOM
 */
@WebServlet(name = "LogearUsuario", urlPatterns = {"/LogearUsuario"})
public class LogearUsuario extends HttpServlet {

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
            HttpSession session = request.getSession();
            String name = request.getParameter("txtNombreUsuario");
            String password = request.getParameter("txtPassword");
            if(new UsuarioDaoImp().validarUsuario(name, password)){
                
                if(new UsuarioDaoImp().validarTipoUsuario(name, password)==1){                    
                    session.setAttribute("Usuario", new UsuarioDaoImp().listarUsuario(name));
                    response.sendRedirect("paginas/Consulta.jsp");
                    
                }else if(new UsuarioDaoImp().validarTipoUsuario(name, password)==2){
                    session.setAttribute("Usuario", new UsuarioDaoImp().listarUsuario(name));
                    response.sendRedirect("paginas/Vendedor.jsp");
                    
                }else if(new UsuarioDaoImp().validarTipoUsuario(name, password)==3){
                     session.setAttribute("Usuario", new UsuarioDaoImp().listarUsuario(name));
                    response.sendRedirect("paginas/Admin.jsp");
                   
                }
            }else{
                request.setAttribute("mensaje", "El usuario no se encuentra");
                response.sendRedirect("paginas/LoginUsuario.jsp");
            }
            
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
