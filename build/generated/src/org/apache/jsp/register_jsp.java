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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Register - ToDo App</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("                background-color: #ebd6fd;\n");
      out.write("                color: #111;\n");
      out.write("                line-height: 1.6;\n");
      out.write("            }\n");
      out.write("            .login-container {\n");
      out.write("                margin-top: 100px;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                flex: 1;\n");
      out.write("                padding: 2rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-box {\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 2rem;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                max-width: 400px;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-box h2 {\n");
      out.write("                font-size: 1.7rem;\n");
      out.write("                margin-bottom: 0.5rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-box p {\n");
      out.write("                font-size: 0.95rem;\n");
      out.write("                color: #666;\n");
      out.write("                margin-bottom: 1.5rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-btn {\n");
      out.write("                width: 50%;\n");
      out.write("                padding: 0.75rem;\n");
      out.write("                background-color: #6b21a8;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 1rem;\n");
      out.write("                margin-top: 0.5rem;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"login-container\">    \n");
      out.write("            <form action=\"register\" method=\"post\" class=\"login-box\">\n");
      out.write("                <h2>User Registration</h2>\n");
      out.write("                <label>Name:</label>\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Enter name\" required><br><br>\n");
      out.write("\n");
      out.write("                <label>Email:</label>\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Enter Email\" required><br><br>\n");
      out.write("\n");
      out.write("                <label>Password:</label>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Enter password\" required><br><br>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"login-btn\">Register</button>\n");
      out.write("\n");
      out.write("                <p>Already have an account??? <a href=\"login.jsp\">Login here</a></p>\n");
      out.write("            </form>\n");
      out.write("        </main>\n");
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
