

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
     .centerNav, a.centerNav { 
        background: black;
        overflow:hidden;
        text-align: center;
        color: yellow;
        margin-top: 10px;
    }
     
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <img class="center" alt="School Image" src="http://localhost:8080/CourseRegistration/schoollogo.jpg">
        <h1>Error Adding/Dropping Classes!</h1>
        <div class="centerNav">
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/ShowClasses.jsp">Back</a> |
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/studentDisplay.jsp">Profile</a>
        </div>
        </div>
    </body>
</html>
