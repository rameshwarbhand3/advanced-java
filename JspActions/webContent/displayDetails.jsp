<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Details</title>
</head>
<body>
<jsp:userBean id="product"class="com.bharath.jsp.Product">
<jsp:setProperty name="product" property="*"/>
</jsp:userBean>
Product Details:

<br/>Id:<jsp:getProperty property="id" name="product"/>
<br/>Name:<jsp:getProperty property="name" name="product"/>
<br/>Description:<jsp:getProperty property="description" name="product"/>
<br/>Price:<jsp:getProperty property="price" name="product"/>

</body>
</html>