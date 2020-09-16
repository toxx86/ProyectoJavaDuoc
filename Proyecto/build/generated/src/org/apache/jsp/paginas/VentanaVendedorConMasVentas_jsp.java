package org.apache.jsp.paginas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import cl.duoc.dej4501.dao.VentasDaoImp;
import cl.duoc.dej4501.dto.Usuario;

public final class VentanaVendedorConMasVentas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("   \n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">VendoTodo</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"Consulta.jsp\">Home</a></li>\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Consultas <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"VentanaTipoDeProductoMasVendido.jsp\">Producto mas vendido</a></li>\n");
      out.write("          <li><a href=\"VentanaVendedorConMasVentas.jsp\">Vendedor Con mas Ventas</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"RegistroUsuario.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Registrarse</a></li>\n");
      out.write("      <li><a href=\"LoginUsuario.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"VendedorConMasVentas\" method=\"POST\">\n");
      out.write("            ");
 ArrayList<Usuario> lista = new VentasDaoImp().ListarVendedorConMasVentas(new VentasDaoImp().codigoVendedorConMasVentas());if(lista!=null){ 
               if(lista.isEmpty()){ 
                 String mensaje=(String)request.getAttribute("mensaje");
                 out.print("-->"+mensaje);
               }else{ 
      out.write("\n");
      out.write("         \n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id Usuario</th>\n");
      out.write("                        <th>Nombre usuario</th>\n");
      out.write("                        <th>Apellido usuario</th>\n");
      out.write("                        <th>Correo usuario</th>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                     ");
 for (Usuario dto : lista) { 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                      <td>");
      out.print( dto.getId_usuario() );
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
      out.write("                      \n");
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
      out.write("        </form>\n");
      out.write("       \n");
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
