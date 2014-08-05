package BusinessObjects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BusinessObjects.Sections;
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
@WebServlet(urlPatterns = {"/addSectionServlet"})
public class addSectionServlet extends HttpServlet {

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
        String CrN;
        String SectionUpdated;
        RequestDispatcher Rd;
        
        //get parameters from prevous page showclasses.jsp
        ID = request.getParameter("userName");
        CrN=request.getParameter("addClass");
        
        System.out.println(ID);
        
        //creates a new section and updates the section based on ID and CRN
        Sections sec1 = new Sections();
        sec1.selectDB(ID);
        SectionUpdated = sec1.insertDB(ID, CrN);
        System.out.print(SectionUpdated);
        
        //adds sections to session to be used later
        HttpSession ses1;
        ses1 = request.getSession();
        ses1.setAttribute("sec1", sec1);
        System.out.println("Student classes added to session");
        
        //checks if there was an error from the database and forwards to the correct page
         if(SectionUpdated.equals("false")){
            Rd = request.getRequestDispatcher("/errorAddDropSec.jsp");
            Rd.forward(request, response);
        }else{    
            Rd = request.getRequestDispatcher("/ShowClasses.jsp");
            Rd.forward(request, response);
        }
        
//        Rd = request.getRequestDispatcher("/ShowClasses.jsp");
//        Rd.forward(request, response);
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
