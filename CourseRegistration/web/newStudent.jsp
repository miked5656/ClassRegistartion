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
         width: 50%;
     }
     input{
          background-color: yellow;
          box-shadow: 5px 3px 2px #888888;
     }
     
     
    </style>
    
    <script>
       function validateForm() {
            var x = document.forms["registration"]["userName"].value;
            var y = document.forms["registration"]["passWD"].value;
            var fn = document.forms["registration"]["firstName"].value;
            var ln = document.forms["registration"]["lastName"].value;
            var st = document.forms["registration"]["street"].value;
            var cty = document.forms["registration"]["city"].value;
            var sta = document.forms["registration"]["state"].value;
            var zp = document.forms["registration"]["zip"].value;
            var em = document.forms["registration"]["email"].value;
            //checks if customer id was filled in
            if (x === null || x === "") {
               document.getElementById("id").innerHTML = "*Required!";
               //alert("Student ID Required");
               return false;
             }
             //checks if password was filled in
            if (y === null || y === ""){
                document.getElementById("pw").innerHTML = "*Required!";
                //alert("Password Required");
                return false;
            }
            //checks if the customer id is a number
           if (isNaN(x)){
                alert("*Student ID uses Numbers Only");
                return false;
            }
            if (fn === null || fn === "") {
               document.getElementById("fn").innerHTML = "*Required!";
               return false;
             }
             if (ln === null || ln === "") {
               document.getElementById("ln").innerHTML = "*Required!";
               return false;
             }
             if (st === null || st === "") {
               document.getElementById("st").innerHTML = "*Required!";
              return false;
             }
             if (cty === null || cty === "") {
               document.getElementById("cty").innerHTML = "*Required!";
              return false;
             }
             if (sta === null || sta === "") {
               document.getElementById("sta").innerHTML = "*Required!";
              return false;
             }
             if (zp === null || zp === "") {
               document.getElementById("zp").innerHTML = "*Required!";
              return false;
             }
             if (em === null || em === "") {
               document.getElementById("em").innerHTML = "*Required!";
              return false;
             }
        }//end function 
        </script>
        <title>Register for Class!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div class="container">
            
            <img class="center" alt="School Image" src="http://localhost:8080/CourseRegistration/schoollogo.jpg">
            <div class="center">
                <form name="registration" onsubmit=" return validateForm()" action="http://localhost:8080/CourseRegistration/newStudentRegister" method="POST">
                <table>
                    <h3>New Student Registration</h3>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="userName"/>
                    <td><div id="id"></div></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="passWD"/></td>
                    <td><div id="pw"></div></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstName"></td>
                    <td><div id="fn"></div></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastName"></td>
                    <td><div id="ln"></div></td>
                </tr>
                <tr>
                    <td>Street:</td>
                    <td><input type="text" name="street"></td>
                    <td><div id="st"></div></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><input type="text" name="city"></td>
                    <td><div id="cty"></div></td>
                </tr>
                <tr>
                    <td>State:</td>
                    <td><input type="text" name="state"></td>
                    <td><div id="sta"></div></td>
                </tr>
                <tr>
                    <td>Zip:</td>
                    <td><input type="text" name="zip"></td>
                    <td><div id="zp"></div></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email"></td>
                    <td><div id="em"></div></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input name="gpa" type="hidden" value="0.00"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"></td>
                    <td><input type="reset" value="Clear"></td>
                </tr>
                </table>

                </form>
            </div>
        </div>
    </body>
</html>