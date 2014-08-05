<%@page import="BusinessObjects.Sections"%>
<%@page import="BusinessObjects.Student"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
    <style>
        body{
            background-image: url("http://localhost:8080/CourseRegistration/always_grey.jpg");
            background-repeat: repeat;
        }
      .container {
         margin-left: auto;
         margin-right: auto;
         width: 50%;
         background-color: white;
         border: 2px solid;
         border-radius: 25px;
         padding-bottom: 10px;
     }
     h1,a{
         text-align:center;  
     }
     
     img.center, a.center {
        display: block;
        margin-left: auto;
        margin-right: auto;
        width: 50%;
        
     } 
     
     .center{
         margin-left: auto;
         margin-right: auto;
         width: 45%;
     }
     input{
          background-color: yellow;
          box-shadow: 5px 3px 2px #888888;
     }
     .centerNav, a.centerNav { 
        background: black;
        overflow:hidden;
        text-align: center;
        color: yellow;
        margin-top: 10px;
    }
     </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Registration</title>
    </head>
    <body>
        <div class="container">
        <img class="center" alt="School Image" src="http://localhost:8080/CourseRegistration/schoollogo.jpg">
            <h3>Registration Details</h3>
        <% Sections Sec1;
           Sec1 = (Sections)session.getAttribute("sec1");
           String StudentID = Sec1.getStudentID();
           String CRN = Sec1.getCrn();
        
           System.out.print(StudentID);
           System.out.print(CRN);
           //out.print("");
           
           Student S1;
           S1 = (Student)session.getAttribute("S1");                
           
         %>
            <!-- creates a database access -->
           <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/registration?zeroDateTimeBehavior=convertToNull"
            user="root"  password="dd5656"/>
           
           <c:set var="empId" value="<%=StudentID%>"/>
           
           <!--Query the database -->
           <sql:query dataSource="${snapshot}" var="result">
            
            SELECT t1.CourseName, t2.CourseID, t2.TimeDays, t2.RoomNo, t3.CRN
            FROM courses as t1
            LEFT JOIN sections as t2 
            ON t1.CourseID = t2.CourseID 
            LEFT JOIN studentschedule as t3 
            ON t2.CRN = t3.CRN 
            WHERE t3.StudentID = ?    
            <sql:param value="${empId}" />
            </sql:query>
 
            <table border="1" width="100%">
            <tr>
               <th>Course Name</th>
               <th>Course ID</th>
               <th>Course Time/Days</th>
               <th>Course RoomNo</th>
               <th>Class CRN</th>
            </tr>
            <!-- goes through each result and displays it in table-->
            <c:forEach var="row" items="${result.rows}">
            <tr>
               <td><c:out value="${row.CourseName}"/></td>
               <td><c:out value="${row.CourseID}"/></td>
               <td><c:out value="${row.TimeDays}"/></td>
               <td><c:out value="${row.RoomNo}"/></td>
               <td><c:out value="${row.CRN}"/></td>
            </tr>
            </c:forEach>
            </table>
           
             <form class="center" name="registration" action="http://localhost:8080/CourseRegistration/addSectionServlet" method="POST">
                 <input type="hidden" name="userName"  value="<%= S1.getUserID() %>"/>
                 Add  Class: <input type="text" name="addClass" required>
                 <input type="submit" value="Add">
             </form>
            <form class="center" name="registration" action="http://localhost:8080/CourseRegistration/dropSectionServlet" method="POST">
                <input type="hidden" name="userName"  value="<%= S1.getUserID() %>"/> 
                Drop Class: <input type="text" name="dropClass" required>
                <input type="submit"   value="Drop">
             </form>
            <div class="centerNav">
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/studentDisplay.jsp">Back</a> |
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/studentDisplay.jsp">Profile</a>
        </div>
        </div>
    </body>
</html>
