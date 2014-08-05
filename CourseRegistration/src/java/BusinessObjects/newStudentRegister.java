package BusinessObjects;

import BusinessObjects.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/newStudentRegister"})
public class newStudentRegister extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Declarations
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
        String newStudentAdded;
        RequestDispatcher Rd;
        
        try{
        //assigns variables from previous form to declarations
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
        
        System.out.println(userName);
        //parses gpa string to double
        GpA = Double.parseDouble(GPA);
        
        //creates a new student
        Student S1;
        S1 = new Student();
        //inserts new student into database students
        newStudentAdded = S1.insertDB(userName, passWD, fName, lName, street, city, state, zip, EM, GpA);
        
        //adds student info to session
        HttpSession Session;
        Session = request.getSession();
        Session.setAttribute("S1", S1);
        System.out.println("Student added to info added to session");
        
        //checks if the student was entered into database and if not sends them to error page
        if(newStudentAdded.equals("false")){
            Rd = request.getRequestDispatcher("/newStudentError.jsp");
            Rd.forward(request, response);
        }else{
            Rd = request.getRequestDispatcher("/newStudentAdded.jsp");
            Rd.forward(request, response);
        }
        
        }catch(Exception Ex){
            System.out.println("Error in Student Registration Servlet");
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
