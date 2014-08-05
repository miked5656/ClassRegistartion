/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessObjects;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jessica
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        //declarations
        String ID;
        String PW;
        RequestDispatcher Rd;
        
        //gets incoming parameters and assigns it to a new value
        ID = request.getParameter("userName");
        PW = request.getParameter("passWD");
        
        System.out.println(ID);
        System.out.println(PW);
        
        //creates a new student and gets database password to check agains 
        //entered password on login form
        Student S1 = new Student();
        S1.selectDB(ID);
        String PWDB = S1.getPassword();
        
        //adds student info to sessions
        HttpSession ses1;
        ses1 = request.getSession();
        ses1.setAttribute("S1", S1);
        System.out.println("Student added to session");
        
        System.out.println(PWDB);
        //checks if password in student database is same as on form
        //sends to login page if correct or error page if not
        if(PW.equals(PWDB)){
            System.out.println("true");
            Rd = request.getRequestDispatcher("/studentDisplay.jsp");
            Rd.forward(request, response);
        }
        else{
            Rd = request.getRequestDispatcher("/ErrorLogin.jsp");
            Rd.forward(request, response);
           }
        }
        catch(Exception E){
            System.out.println(E);
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
