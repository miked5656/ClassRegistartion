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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <style>\r\n");
      out.write("        body{\r\n");
      out.write("            background-image: url(\"http://localhost:8080/CourseRegistration/always_grey.jpg\");\r\n");
      out.write("            background-repeat: repeat;\r\n");
      out.write("        }\r\n");
      out.write("      .container {\r\n");
      out.write("         margin-left: auto;\r\n");
      out.write("         margin-right: auto;\r\n");
      out.write("         width: 50%;\r\n");
      out.write("         background-color: white;\r\n");
      out.write("         border: 2px solid;\r\n");
      out.write("         border-radius: 25px;\r\n");
      out.write("         padding-bottom: 10px;\r\n");
      out.write("     }\r\n");
      out.write("     h1,a, h3{\r\n");
      out.write("         text-align:center;  \r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     img.center, a.center {\r\n");
      out.write("        display: block;\r\n");
      out.write("        margin-left: auto;\r\n");
      out.write("        margin-right: auto;\r\n");
      out.write("        padding-bottom: 0;\r\n");
      out.write("        \r\n");
      out.write("     } \r\n");
      out.write("     \r\n");
      out.write("     .center{\r\n");
      out.write("         margin-left: auto;\r\n");
      out.write("         margin-right: auto;\r\n");
      out.write("         width: 30%;\r\n");
      out.write("     }\r\n");
      out.write("     input{\r\n");
      out.write("          background-color: yellow;\r\n");
      out.write("          box-shadow: 5px 3px 2px #888888;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("    </style>\r\n");
      out.write("        <title>Register for Class!</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("            <img class=\"center\" alt=\"School Image\" src=\"http://localhost:8080/CourseRegistration/schoollogo.jpg\">\r\n");
      out.write("            <div class=\"center\">\r\n");
      out.write("                <h3>Log-In</h3>\r\n");
      out.write("                <form name=\"login\" onsubmit=\" return validateForm()\" action=\"http://localhost:8080/CourseRegistration/LoginServlet\" method=\"POST\">\r\n");
      out.write("                <table>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Username:</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userName\"/>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Password:</td>\r\n");
      out.write("                    <td><input type=\"password\" name=\"passWD\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"submit\" value=\"Login\"></td>\r\n");
      out.write("                    <td><input type=\"reset\" value=\"Clear\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a class=\"center\" href=\"http://localhost:8080/CourseRegistration/newStudent.jsp\">New Student Register</a>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
