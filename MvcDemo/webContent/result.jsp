<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<%
  int result = (Integer)request.getAttribute("result");
	out.println("<b>"+"The result is : "+result+"</b>");

%>
</body>
</html>