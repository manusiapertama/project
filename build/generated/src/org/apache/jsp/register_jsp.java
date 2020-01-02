package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>Veranda Futsal</title>\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:Lato:300,400,700,300italic,400italic|Raleway:400,300,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Bootstrap CSS File -->\n");
      out.write("  <link href=\"lib/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Libraries CSS Files -->\n");
      out.write("  <link href=\"lib/icomoon/icomoon.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Main Stylesheet File -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- =======================================================\n");
      out.write("    Template Name: Shield\n");
      out.write("    Template URL: https://templatemag.com/shield-bootstrap-agency-template/\n");
      out.write("    Author: TemplateMag.com\n");
      out.write("    License: https://templatemag.com/license/\n");
      out.write("  ======================================================= -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("form {border: 3px solid #f1f1f1;}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password], input[type=email] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cancelbtn {\n");
      out.write("  width: auto;\n");
      out.write("  padding: 10px 18px;\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("  width: 40%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("  float: right;\n");
      out.write("  padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("  span.psw {\n");
      out.write("     display: block;\n");
      out.write("     float: none;\n");
      out.write("  }\n");
      out.write("  .cancelbtn {\n");
      out.write("     width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <body data-spy=\"scroll\" data-offset=\"58\" data-target=\"#navbar-main\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div id=\"navbar-main\">\n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li><a href=\"index.jsp\" class=\"smoothscroll\">Home</a></li>\n");
      out.write("            <li> <a href=\"index.jsp/#Field\" class=\"smoothscroll\"> Field</a></li>\n");
      out.write("            <li> <a href=\"#contact\" class=\"smoothscroll\"> Contact</a></li></ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li> <a href=\"#Register\" class=\"smoothscroll\"> Register</a></li>\n");
      out.write("            <li> <a href=\"login.jsp\"> Log in</a></li>\n");
      out.write("        </div>\n");
      out.write("        <!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <center><h2>Register Form</h2></center>\n");
      out.write("  <form action=\"RegisController?data=user&proses=input-user\" method=\"post\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("      <label for=\"nama\">Name:</label>\n");
      out.write("      <input type=\"name\" class=\"form-control\" id=\"nama\" placeholder=\"Enter Name\" name=\"nama\">\n");
      out.write("      </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"no_telpon\">Mobile:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"no_telpon\" placeholder=\"Enter Mobile\" name=\"no_telpon\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Email:</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Password:</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"password\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <input type=\"hidden\" class=\"form-control\" name=\"role\" value=\"user\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("  </form>\n");
      out.write("</body>\n");
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
