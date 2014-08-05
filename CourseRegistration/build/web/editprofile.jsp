<%@page import="BusinessObjects.Student"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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
        <title>Register for Class!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <% Student S1;
           S1 = (Student)session.getAttribute("S1");                
        %>
        <div class="container">
            
            <img class="center" alt="School Image" src="http://localhost:8080/CourseRegistration/schoollogo.jpg">
            <div class="center">
                <form name="registration" onsubmit=" return validateForm()" action="http://localhost:8080/CourseRegistration/editStudentProfile" method="POST">
                <table>
                    <h3>Edit Personal Information</h3>
                <tr>
                    <td></td>
                    <td><input type="hidden" name="userName" value="<%= S1.getUserID() %>"/>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="passWD" required value="<%= S1.getPassword() %>"/></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstName" required value="<%= S1.getFirstName() %>"></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastName" required value="<%= S1.getLastName() %>"></td>
                </tr>
                <tr>
                    <td>Street:</td>
                    <td><input type="text" name="street" required value="<%= S1.getStreet() %>"></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><input type="text" name="city" required value="<%= S1.getCity() %>"></td>
                </tr>
                <tr>
                    <td>State:</td>
                    <td><input type="text" name="state" required value="<%= S1.getState() %>"></td>
                </tr>
                <tr>
                    <td>Zip:</td>
                    <td><input type="text" name="zip" required value="<%= S1.getZip() %>"></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" required value="<%= S1.getEmail() %>"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input name="gpa" type="hidden" value="<%= S1.getGpa() %>"></td>
                    
                </tr>
                <tr>
                    <td></td>
                    <td><input name="currentUserName" type="hidden" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update"></td>
                    <td><input type="reset" value="Clear"></td>
                </tr>
                </table>
                    
                </form>
                  <div class="centerNav">
                   <a class="centerNav" href="http://localhost:8080/CourseRegistration/studentDisplay.jsp">Back</a>
                 </div>
            </div>
        </div>
    </body>
</html>