package org.apache.jsp.paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import cl.duoc.dej4501.dao.UsuarioDaoImp;
import cl.duoc.dej4501.dto.Usuario;
import cl.duoc.dej4501.dto.Usuario;

public final class VentanaMantenerUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">VendoTodo</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Consulta <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"VentanaTipoDeProductoMasVendido.jsp\">Producto mas vendido</a></li>\n");
      out.write("          <li><a href=\"VentanaVendedorConMasVentas.jsp\">Vendedor Con mas Ventas</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Ventas <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"AgregarVenta.jsp\">Realizar Venta</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Mantenedor <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"VentanaMantenerUsuario.jsp\">Mantener Usuario</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      \n");
      out.write("      <li><a href=\"LoginUsuario.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span>Cerrar Session</a>");
 session.invalidate();  
      out.write("</li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"/Proyecto/BorrarPorId\" method=\"POST\">\n");
      out.write("                ");
 ArrayList<Usuario> lista = new UsuarioDaoImp().ListarTodosLosUsuarios();if(lista!=null){ 
               if(lista.isEmpty()){ 
                 String mensaje=(String)request.getAttribute("mensaje");
                 out.print("-->"+mensaje);
               }else{ 
      out.write("\n");
      out.write("         \n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id usuario</th>\n");
      out.write("                        <th>Login usuario</th>\n");
      out.write("                        <th>Password usuario</th>\n");
      out.write("                        <th>Nombre usuario</th>\n");
      out.write("                        <th>Apellido usuario</th>\n");
      out.write("                        <th>Correo usuario</th>\n");
      out.write("                        <th>Codigo perfil</th>\n");
      out.write("                        <th>Fecha de Nacimiento</th>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                     ");
 for (Usuario dto : lista) { 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                      \n");
      out.write("                      <td>");
      out.print( dto.getId_usuario() );
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( dto.getLogin_usuario() );
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( dto.getPass_usuario() );
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( dto.getNombre_usuario() );
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( dto.getApellido_usuario() );
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( dto.getCorreo_usuario() );
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( dto.getCodigo_perfil() );
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( dto.getFechaNacimiento_usuario() );
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("               ");
 } 
      out.write("      \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("               ");
 } 
      out.write("\n");
      out.write("             ");
 } 
      out.write("\n");
      out.write("             <br>\n");
      out.write("             <table border=\"0\">\n");
      out.write("                 <thead>\n");
      out.write("                     \n");
      out.write("                 </thead>\n");
      out.write("                 <tbody>\n");
      out.write("                     <tr>\n");
      out.write("                         <td>Borrar por id</td>\n");
      out.write("                         <td><input type=\"text\" name=\"txtBorrarId\" value=\"\" /></td>\n");
      out.write("                     </tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td><input type=\"submit\" value=\"Borrar\" name=\"btnBorrarId\" /></td>\n");
      out.write("                     </tr>\n");
      out.write("                     \n");
      out.write("                 </tbody>\n");
      out.write("             </table>\n");
      out.write("\n");
      out.write("             \n");
      out.write("        </form>\n");
      out.write("             <form action=\"/Proyecto/IrAlModificar\" method=\"POST\">\n");
      out.write("                 <table border=\"1\">\n");
      out.write("                     \n");
      out.write("                     <tbody>\n");
      out.write("                         <tr>\n");
      out.write("                             <td>Modificar usuario por id</td>\n");
      out.write("                             <td><input type=\"text\" name=\"txtModificarId\" value=\"\" /></td>\n");
      out.write("                         </tr>\n");
      out.write("                         <tr>\n");
      out.write("                             <td><input type=\"submit\" value=\"Modificar\" name=\"btnModificarId\" /></td>\n");
      out.write("                             <td></td>\n");
      out.write("                         </tr>\n");
      out.write("                     </tbody>\n");
      out.write("                 </table>\n");
      out.write("\n");
      out.write("             </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
