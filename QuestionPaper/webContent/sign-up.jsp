<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</head>
<body>
	<form action="<%=request.getContextPath()%>/signUpServlet"method="post">
		<div class="formContainer">
			<h1>Sign Up Form</h1>
			<hr>
			<label for="userName"><b>UserName</b></label> <input type="text"
				placeholder="Enter userName" name="userName" required><br/><br/>
				
			 <label
				for="password"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required> <br/><br/>
				
			<label for="email"><b>Email</b></label>  
				<input type="text" placeholder="Enter Email" name="email" required><br/><br/>
				
			<label for="firstName"><b>FirstName</b></label> <input type="text"
				placeholder="Enter firstName" name="firstName" required><br/><br/>
				
				<label for="lastName"><b>LastName</b></label> <input type="text"
				placeholder="Enter lastName" name="lastName" required><br/><br/>	
				
			<!--  <label> <input type="checkbox"
				checked="checked" name="remember" style="marginbottom: 15px">
				Remember me </label><br/><br/>-->
				
			<div>
				<button type="button" class="cancel">Cancel</button>&nbsp;&nbsp;
				<button type="submit" class="signup">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>