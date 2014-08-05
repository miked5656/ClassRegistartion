<%-- 
    Document   : index
    Created on : Jun 12, 2014, 6:41:10 PM
    Author     : Michael Day
--%>
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
        <title>Register for Class!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div class="container">
            
            <img class="center" alt="School Image" src="http://localhost:8080/CourseRegistration/schoollogo.jpg">
            <div class="center">
                <p>That User Name 
                <% String userName = request.getParameter("userName"); %>
                <% out.print(userName); %>
                already exists. Please try again!
                </p>
            </div>
            <div class="centerNav">
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/newStudent.jsp">Back</a> |
                <a class="centerNav" href="http://localhost:8080/CourseRegistration/index.jsp">Home</a>
            </div>
        </div>
    </body>
</html>