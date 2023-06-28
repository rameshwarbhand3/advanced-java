<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create product</title>
</head>
<body>
	<h2>Create Product</h2>
	<form action="productController" method="post">
		<pre>
Name : <input type="text" name="name"><br />
Description : <input type="text" name="description"><br />
Price : <input type="text" name="price"><br />
CouponCode : <input type="text" name="couponCode"><br />
<input type="hidden" name="action" value="find">
<input type="submit" value="Save">
</pre>
	</form>
</body>
</html>