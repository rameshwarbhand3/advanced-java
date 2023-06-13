
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach var = "tempstudent" items="${student_list}">
${tempstudent}<br/>
</c:forEach>



</body>

</html>