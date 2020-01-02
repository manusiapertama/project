package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>LOGIN Admin</title>\n");
      out.write("    <!-- Core CSS - Include with every page -->\n");
      out.write("    <link href=\"assets/plugins/bootstrap/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/plugins/pace/pace-theme-big-counter.css\" rel=\"stylesheet\" />\n");
      out.write("   <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("      <link href=\"assets/css/main-style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"body-Login-back\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("       \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 col-md-offset-4 text-center logo-margin \">\n");
      out.write("              <h1 style=\"color: white;\"><b>Veranda Futsal</b></h1>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                <div class=\"login-panel panel panel-default\">                  \n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">Please Sign In</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form role=\"form\" action=\"Login?proses=login\" method=\"post\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"E-mail\" name=\"email\" type=\"email\" autofocus>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-lg btn-success btn-block\">Login</button>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("     <!-- Core Scripts - Include with every page -->\n");
      out.write("    <script src=\"assets/plugins/jquery-1.10.2.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
