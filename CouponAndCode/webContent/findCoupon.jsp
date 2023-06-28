<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find coupon</title>
</head>
<body>
<h2>Find coupon</h2>
<form action="couponController" method="post">
Code : <input type="text"name="couponCode"><br/>
<input type ="hidden" name="action" value="find"><br/>
<input type = "submit" value="Find">
</form>
</body>
</html>