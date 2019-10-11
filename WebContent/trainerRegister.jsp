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

                <span>Trainer Registration</span>
            </div>
            <form action="trainerregister" method="post">

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
                        <label for="passowrd">Password</label>
                        <input type="password" name="passowrd" placeholder="password">
                </div>
                
                  <div class="field">
                        <label for="specialization">Specialization</label>
                       <select name="specialization" >
						  <option value="Java">Java</option>
						  <option value="Android">Android</option>
						  <option value="Ml">Machine Learning</option>
						  <option value="Web Dev">Web Development</option>
                        </select>
                </div>

                <div class="field">
                        <label for="experience">Years Of Experience </label>
                       <select name="experience" >
						  <option value="1">1</option>
						  <option value="2">2</option>
						  <option value="3">3</option>
						  <option value="4">3+</option>
                        </select>
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