<%-- 
    Document   : index
    Created on : Jun 12, 2014, 6:41:10 PM
    Author     : Michael Day
--%>
<!DOCTYPE html>
<html>
    <head>
      <script>
       function validateForm() {
            var x = document.forms["login"]["userName"].value;
            var y = document.forms["login"]["passWD"].value;
            //checks if customer id was filled in
            if (x === null || x === "") {
               document.getElementById("id").innerHTML = "*ID Required!";
               //alert("Student ID Required");
               return false;
             }
             //checks if password was filled in
            if (y === null || y === ""){
                document.getElementById("pw").innerHTML = "*PW Required!";
                //alert("Password Required");
                return false;
            }
            //checks if the customer id is a number
           if (isNaN(x)){
                alert("*Student ID uses Numbers Only");
                return false;
            }
            
        }//end function 
        </script>
        
    <style>
        body{
            background-image: url("http://localhost:8080/CourseRegistration/always_grey.jpg");
            background-repeat: repeat;
        }
        #pw, #id{
            color: red;
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
         width: 50%;
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
                <h3>Log-In</h3>
                <form name="login" onsubmit=" return validateForm()" action="http://localhost:8080/CourseRegistration/LoginServlet" method="POST">
                <table>
                
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="userName"/>
                    <td><div id="id"></div>
                    <td><div id="myDiv"></div></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="passWD"/></td>
                    <td><div id="pw"></div>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"></td>
                    <td><input type="reset" value="Clear"></td>
                </tr>
                </table>

                </form>
            </div>
            <a class="center" href="http://localhost:8080/CourseRegistration/newStudent.jsp">New Student Register</a>
            
        </div>
    </body>
</html>