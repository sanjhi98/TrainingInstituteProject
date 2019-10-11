<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div class="studentform">

            <div class="header1">

                <span>Student Registration</span>
            </div>
            <form action="studentregister" method="post">

                <div class="field">
                    <label for="name">Name</label>
                    <input type="text" name="name" placeholder="Name">
                </div>

                <div class="field">
                        <label for="username">UserName</label>
                        <input type="text" name="uname" placeholder="UserName">
                </div>
                
                <div class="field">
                        <label for="username">Email</label>
                        <input type="text" name="email" placeholder="Email">
                </div>
                
                  <div class="field">
                        <label for="age">Age</label>
                        <input type="text" name="age" placeholder="Age">
                </div>

                <div class="field">
                        <label for="passowrd">Password</label>
                        <input type="password" name="passowrd" placeholder="password">
                </div>

                <div class="field">
                        <label for="fathersname">Father's Name</label>
                        <input type="text" name="fathersname" placeholder="Father's Name">
                </div>

               

                <div class="field">
                        <label for="Id Proof">Aadhar Card </label>
                        <input type="text" name="aadharcard" placeholder="Aadhar Card" required maxlength="=12" minlength="12">
                </div>

                <div class="field">
                        <label for="contact">Contact Number </label>
                        <input type="text" name="contact" placeholder="Contact">
                </div>

                <div class="field">
                        
                        <input type="submit" value="Register">
                </div>


            </form>
        </div>

</body>
</html>