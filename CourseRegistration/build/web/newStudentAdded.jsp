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
         padding-bottom: 10px;
     }
     h1,a, h3{
         text-align:center;  
     }
     
     img.center, a.center {
        display: block;
        margin-left: auto;
        margin-right: auto;
        padding-bottom: 0;
        
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
     
     .table{
         margin-left: auto;
         margin-right: auto;
         border-radius: 25px;
         border-color: gray;
         padding: 5px;
     }
     
    .centerNav, a.centerNav { 
        background: black;
        overflow:hidden;
        text-align: center;
        color: yellow;
        margin-top: 10px;
    }
     
     </style>
        <title>Welcome to School!!!</title>
    </head>
    <body>
        <div class="container">
        <h2>Thank you for registering!</h2>
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
            <table class="table" border="1" width="95%">
                <tr>
                    <th>Student ID</th>
                    <th>Password</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Street</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Zip</th>
                    <th>Email</th>
                    <th>GPA</th>
                </tr>
                <tr>
                    <td><% out.print(UserName); %></td>
                    <td><% out.print(Password); %></td>
                    <td><% out.print(FN); %></td>
                    <td><% out.print(LN); %></td>
                    <td><% out.print(STR); %></td>
                    <td><% out.print(CTY); %></td>
                    <td><% out.print(ST); %></td>
                    <td><% out.print(Zip); %></td>
                    <td><% out.print(EM); %></td>
                    <td><% out.print(GPA); %></td>
                </tr>
            </table>
            <div class="centerNav">
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/index.jsp">Click Here to Log-In</a>
            </div>
        </div>
    </body>
</html>
