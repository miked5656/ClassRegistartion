<%@page import="BusinessObjects.Student"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
         padding-left: 20px;     
         padding-bottom: 20px;
      }
     h1,a, h3{
         text-align:center;  
     }
     img.center{
        display: block;
        margin-left: auto;
        margin-right: auto;
        padding-bottom: 10px;   
     } 
     .centerNav, a.centerNav { 
        background: black;
        overflow:hidden;
        text-align: center;
        color: yellow;
        margin-top: 10px;
    }
     .center{
         margin-left: auto;
         margin-right: auto;
         width: 30%;
     }
     input{
          background-color: yellow;
          box-shadow: 5px 3px 2px #888888;
     }
     
     p.registration{
         font-size: 30px;
         font-weight: bold;
         color:blue;
         padding-bottom: 0px;
         margin-bottom: 0px;
     }
     
     .editMargin{
         padding: 0px;
         margin: 0px;
     }
    </style>
        <title>Student Information</title>
    </head>
    <body>
        <div class="container">
        <img class="center" alt="School Image" src="http://localhost:8080/CourseRegistration/schoollogo.jpg">
            <h3>Personal Information</h3>
        <% Student S1;
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
            %>
            
           Student ID: <% out.print(UserName); %> <br/>
           Password: <% out.print(Password); %> <br/>
           First Name: <% out.print(FN); %> <br/>
           Last Name:  <% out.print(LN); %> <br/>
           Address: <% out.print(STR); %> <br/>
           <% out.print(CTY); %> 
            <% out.print(ST); %> 
            <% out.print(Zip); %> <br/>
           Email:  <% out.print(EM); %> <br/>
           GPA: <% out.print(GPA); %> <br/>
           
            <a href="http://localhost:8080/CourseRegistration/editprofile.jsp">Edit Profile</a><br/>
            <hr width="90%">
            <p class="registration">Registration</p>
            <p class="editMargin">Register for classes and display your class schedule.</p>
       
            <form name="registration" onsubmit=" return validateForm()" action="http://localhost:8080/CourseRegistration/RegistrationServlet" method="POST">
                <input type="hidden" name="userName" value="<%= S1.getUserID() %>"/>
                <input type="submit" value="Register">
            </form>
        </div>
    </body>
</html>
