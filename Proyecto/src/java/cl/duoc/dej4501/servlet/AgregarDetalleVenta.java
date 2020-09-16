/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.servlet;

import cl.duoc.dej4501.dao.DetalleVentaImp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cl.duoc.dej4501.dto.Detalle_Venta;
import cl.duoc.dej4501.dao.ProductoDaoImp;
import cl.duoc.dej4501.dao.VentasDaoImp;
import cl.duoc.dej4501.dto.Producto;
import cl.duoc.dej4501.dto.Ventas;
/**
 *
 * @author Toragin
 */
@WebServlet(name = "AgregarDetalleVenta", urlPatterns = {"/AgregarDetalleVenta"})
public class AgregarDetalleVenta extends HttpServlet {

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
            Detalle_Venta dto = new Detalle_Venta();          
            dto.setCodigo_producto(new ProductoDaoImp().nombreProductoAId(request.getParameter("cmbProducto")));
            dto.setCantidad(Integer.parseInt(request.getParameter("txtCantidad")));
           
            System.out.println(new VentasDaoImp().SiguienteVenta());
            System.out.println(new DetalleVentaImp().UltimaVenta());
            dto.setCodigo_venta(new DetalleVentaImp().UltimaVenta());
            dto.setTotal(new ProductoDaoImp().ListarPrecio(request.getParameter("cmbProducto"))*Integer.parseInt(request.getParameter("txtCantidad")));
            
            if(new DetalleVentaImp().agregar(dto)){
                request.setAttribute("mensaje", "Detalle venta grabado");
            }else{
                request.setAttribute("mensaje", "Detalle no grabado");
            }
            request.getRequestDispatcher(
                    "paginas/AgregarItem.jsp").forward(request, response);
            
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
