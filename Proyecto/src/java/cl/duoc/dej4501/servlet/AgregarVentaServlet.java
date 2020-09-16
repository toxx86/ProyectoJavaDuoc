/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.servlet;

import cl.duoc.dej4501.dto.Usuario;
import cl.duoc.dej4501.dto.Ventas;
import cl.duoc.dej4501.dao.UsuarioDaoImp;
import cl.duoc.dej4501.dao.VentasDaoImp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author CETECOM
 */
@WebServlet(name = "AgregarVentaServlet", urlPatterns = {"/AgregarVentaServlet"})
public class AgregarVentaServlet extends HttpServlet {

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
            Ventas dto = new Ventas();
            Usuario user = new Usuario();
            
          //  dto.setCodigo_venta(new VentasDaoImp().SiguienteVenta());
            dto.setCodigo_vendedor(Integer.parseInt(request.getParameter("txtCodigoVendedor")));
            if(new VentasDaoImp().agregar(dto)){
                request.setAttribute("mensaje", "Se agrego la venta");
                response.sendRedirect("paginas/AgregarItem.jsp");
            }else
            {
                request.setAttribute("mensaje", "No se pudo agregar la venta");
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
