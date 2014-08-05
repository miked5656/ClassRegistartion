package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-image: url(\"http://localhost:8080/CourseRegistration/always_grey.jpg\");\n");
      out.write("            background-repeat: repeat;\n");
      out.write("        }\n");
      out.write("      .container {\n");
      out.write("         margin-left: auto;\n");
      out.write("         margin-right: auto;\n");
      out.write("         width: 50%;\n");
      out.write("         background-color: white;\n");
      out.write("         border: 2px solid;\n");
      out.write("         border-radius: 25px;\n");
      out.write("         padding-bottom: 10px;\n");
      out.write("     }\n");
      out.write("     h1,a{\n");
      out.write("         text-align:center;  \n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     img.center, a.center {\n");
      out.write("        display: block;\n");
      out.write("        margin-left: auto;\n");
      out.write("        margin-right: auto;\n");
      out.write("        width: 50%;\n");
      out.write("        \n");
      out.write("     } \n");
      out.write("     \n");
      out.write("     .center{\n");
      out.write("         margin-left: auto;\n");
      out.write("         margin-right: auto;\n");
      out.write("         width: 45%;\n");
      out.write("     }\n");
      out.write("     input{\n");
      out.write("          background-color: yellow;\n");
      out.write("          box-shadow: 5px 3px 2px #888888;\n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     \n");
      out.write("    </style>\n");
      out.write("        <title>Register for Class!</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <img class=\"center\" alt=\"School Image\" src=\"http://localhost:8080/CourseRegistration/schoollogo.jpg\">\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <form name=\"registration\" onsubmit=\" return validateForm()\" action=\"http://localhost:8080/CourseRegistration/newStudentRegister\" method=\"POST\">\n");
      out.write("                <table>\n");
      out.write("                    <h3>New Student Registration</h3>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Username:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"userName\"/>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"passWD\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>First Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"firstName\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"lastName\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Street:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"street\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"city\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>State:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"state\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>zip:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"zip\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email:</td>\n");
      out.write("                    <td><input type=\"email\" name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input name=\"gpa\" type=\"hidden\" value=\"0.00\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Register\"></td>\n");
      out.write("                    <td><input type=\"reset\" value=\"Clear\"></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
