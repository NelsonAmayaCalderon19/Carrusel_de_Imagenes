package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Carrusel</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"slides\">\n");
      out.write("                <img src=\"img/1.jpg\" width=\"100%\" height=\"100%\" alt=\"\">\n");
      out.write("                <img src=\"img/2.jpg\" width=\"100%\" height=\"100%\" alt=\"\">\n");
      out.write("                <img src=\"img/3.jpg\" width=\"100%\" height=\"100%\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slides.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            /*$(function(){\n");
      out.write("                $(\".slides\").slidesjs({\n");
      out.write("                   \n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            });*/\n");
      out.write("    $(function(){\n");
      out.write("    $(\".slides\").slidesjs({  \n");
      out.write("        play:{\n");
      out.write("            active: true,\n");
      out.write("            \n");
      out.write("            effect: \"slide\",\n");
      out.write("            \n");
      out.write("            interval: 3000,\n");
      out.write("            \n");
      out.write("            auto: true,\n");
      out.write("            \n");
      out.write("            swap: true,\n");
      out.write("            \n");
      out.write("            pauseOnHover: false,\n");
      out.write("            \n");
      out.write("            restarDelay: 2500\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("        });\n");
      out.write("            </script>\n");
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
