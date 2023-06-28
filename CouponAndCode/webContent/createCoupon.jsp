<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create coupon</title>
</head>
<body>
	<h2>Create Coupon</h2>
	<form action="couponController" method="post">
		<pre>
Coupon code : <input type="text" name="couponCode"><br />
Discount : <input type="text" name="discount"><br />
Expiry Date : <input type="text" name="expiryDate"><br />
<input type="hidden" name="action" value="create">
<input type="submit" value="Save">
</pre>
	</form>
</body>
</html>