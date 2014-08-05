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
 * @author Michael Day
 */
@WebServlet(urlPatterns = {"/editStudentProfile"})
public class editStudentProfile extends HttpServlet {

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
         PrintWriter out = response.getWriter();
        //declarations
        String userName;
        String passWD;
        String fName;
        String lName;
        String street;
        String city;
        String state;
        String zip;
        String EM;
        String GPA;
        double GpA;
        String studentUpdated;
        RequestDispatcher Rd;
        
        try{
        //sets variables to parameters received from previous page
        userName = request.getParameter("userName");
        passWD = request.getParameter("passWD");
        fName = request.getParameter("firstName");
        lName = request.getParameter("lastName");
        street = request.getParameter("street");
        city = request.getParameter("city");
        state =request.getParameter("state");
        zip = request.getParameter("zip");
        EM = request.getParameter("email");
        GPA = request.getParameter("gpa");
        
        //prints out variables to make sure we got them from the previous page
        System.out.println(userName);
        System.out.println(passWD);
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip);
        System.out.println(EM);
        System.out.println("gpa " + GPA);
               
        
        System.out.println(userName);
        //converts string to double
        GpA = Double.parseDouble(GPA);
        System.out.println(GpA);
        
        //creates a new student object and updates the database
        Student S1;
        S1 = new Student();
        S1.selectDB(userName);
        S1.setUserID(userName);
        S1.setPassword(passWD);
        S1.setFirstName(fName);
        S1.setLastName(lName);
        S1.setStreet(street);
        S1.setCity(city);
        S1.setState(state);
        S1.setZip(zip);
        S1.setEmail(EM);
        S1.setGpa(GpA);
        
        studentUpdated = S1.updateDB();
        
        //selects the student from the database after update and adds it to session 
        //to ge used at a later time
        S1.selectDB(userName);
        HttpSession Session;
        Session = request.getSession();
        Session.setAttribute("S1", S1);
        System.out.println("Student added to info added to session");
        
        //if/else to check if there was an error in updating the database
        if(studentUpdated.equals("false")){
            Rd = request.getRequestDispatcher("/errorUpdatingProfile.jsp");
            Rd.forward(request, response);
        }else{    
            Rd = request.getRequestDispatcher("/studentDisplay.jsp");
            Rd.forward(request, response);
        }
        
        }catch(Exception Ex){
            System.out.println(Ex);
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
