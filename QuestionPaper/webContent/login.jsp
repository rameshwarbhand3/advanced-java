<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<script type="text/javascript">
	function preventBack() {
		window.history.forward();
	}
	setTimeout("preventBack()", 0);
	window.onunload = function() {
		null
	};
</script>
</head>
<body>
	
	<div align="center">
		<h1>User Login form</h1>

		<form action="<%=request.getContextPath()%>/loginServlet"
			method="post">
			UserName : <input type="text" name="username"><br /> <br />
			Password : <input type="password" name="password"><br /> <br />
			<input type="submit" value="Submit">

		</form>

	</div>
</body>
</html>