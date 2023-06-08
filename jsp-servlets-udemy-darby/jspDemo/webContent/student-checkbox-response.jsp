<html>
<head><title>Student Confirmation Title</title></head>
<body>
Student is confirmed to : ${param.firstName} ${param.lastName}
<br></br>
Favorite programming Language : 
<!-- list of languages -->
<ul>
<% 
String[] langs = request.getParameterValues("favoriteLanguage");
if(langs != null){
for(String temp : langs){
out.println("<li>" + temp + "</li>");
}
}
%>
</ul> 

</body>

</html>