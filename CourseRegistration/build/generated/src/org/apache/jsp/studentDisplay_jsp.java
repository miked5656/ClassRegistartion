package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BusinessObjects.Student;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class studentDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
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
      out.write("         padding-left: 20px;     \n");
      out.write("         padding-bottom: 20px;\n");
      out.write("      }\n");
      out.write("     h1,a, h3{\n");
      out.write("         text-align:center;  \n");
      out.write("     }\n");
      out.write("     img.center{\n");
      out.write("        display: block;\n");
      out.write("        margin-left: auto;\n");
      out.write("        margin-right: auto;\n");
      out.write("        padding-bottom: 10px;   \n");
      out.write("     } \n");
      out.write("     .centerNav, a.centerNav { \n");
      out.write("        background: black;\n");
      out.write("        overflow:hidden;\n");
      out.write("        text-align: center;\n");
      out.write("        color: yellow;\n");
      out.write("        margin-top: 10px;\n");
      out.write("    }\n");
      out.write("     .center{\n");
      out.write("         margin-left: auto;\n");
      out.write("         margin-right: auto;\n");
      out.write("         width: 30%;\n");
      out.write("     }\n");
      out.write("     input{\n");
      out.write("          background-color: yellow;\n");
      out.write("          box-shadow: 5px 3px 2px #888888;\n");
      out.write("     }\n");
      out.write("    </style>\n");
      out.write("        <title>Student Information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h3>Personal Information</h3>\n");
      out.write("        ");
 Student S1;
           S1 = (Student)session.getAttribute("S1");
           String UserName = S1.getUserID();
           String Password = S1.getPassword();
           String FN = S1.getFirstName();
           String LN = S1.getLastName();
           String STR = S1.getStreet();
           String CTY = S1.getCity();
           String ST = S1.getState();
           String Zip = S1.getZip();
           String EM = S1.getEmail();
           Double GPA = S1.getGpa();
           
           
           System.out.print(UserName);
           System.out.print(Password);
           //out.print("");
            
      out.write("\n");
      out.write("            \n");
      out.write("           Student ID: ");
 out.print(UserName); 
      out.write(" <br/>\n");
      out.write("           Password: ");
 out.print(Password); 
      out.write(" <br/>\n");
      out.write("           First Name: ");
 out.print(FN); 
      out.write(" <br/>\n");
      out.write("           Last Name:  ");
 out.print(LN); 
      out.write(" <br/>\n");
      out.write("           Address: ");
 out.print(STR); 
      out.write(" <br/>\n");
      out.write("           ");
 out.print(CTY); 
      out.write(" \n");
      out.write("            ");
 out.print(ST); 
      out.write(" \n");
      out.write("            ");
 out.print(Zip); 
      out.write(" <br/>\n");
      out.write("           Email:  ");
 out.print(EM); 
      out.write(" <br/>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <a href=\"http://localhost:8080/CourseRegistration/editprofile.jsp\">Edit Profile</a>\n");
      out.write("        </div>\n");
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
