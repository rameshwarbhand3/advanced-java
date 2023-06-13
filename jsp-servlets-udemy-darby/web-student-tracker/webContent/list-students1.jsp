<%@ page import="java.util.*, com.luv2code.web.jdbc.*"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<%
	// get the students from the request object (sent by servlet)
	List<Student> theStudents = 
					(List<Student>) request.getAttribute("STUDENT_LIST");
%>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>FooBar University</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">
			<!-- put add student button to add student -->
			<input type="button" value="Add Student"
				onclick="window.location.href='add-student-form.jsp';return false;"
				class="add-student-button">

			<table>

				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>

				<% for (Student tempStudent : theStudents) { %>

				<tr>
					<td><%= tempStudent.getFirstName() %></td>
					<td><%= tempStudent.getLastName() %></td>
					<td><%= tempStudent.getEmail() %></td>
					<td>todo:Add a link here</td>
				</tr>

				<% } %>

			</table>

		</div>
	</div>

</body>


</html>







