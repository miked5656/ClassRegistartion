<%-- 
    Document   : ErrorLogin
    Created on : Jul 23, 2014, 2:09:29 PM
    Author     : Jessica
--%>

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
    </style>
        <title>Student Log-In Error</title>
    </head>
    <body>
        <div class="container">
        <h1>Error Logging In!!</h1>
        <p>Your Username and Password do not match our records.</p>
        <div class="centerNav">
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/index.jsp">Return Try Again</a>
            </div>
        </div>
    </body>
</html>
