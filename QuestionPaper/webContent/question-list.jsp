<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Question Paper mangement System</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!--  <script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>-->
</head>

<body>

	<h3 class="text-center">
		Welcome to
		<%=request.getParameter("name")%>!
	</h3>
	<form action="<%=request.getContextPath()%>/logout" method="post">
		<h4 class="text-right">
			<input type="submit" value="Logout">
		</h4>
	</form>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand">
					Question paper Generator </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Questions</a></li>
			</ul>

		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Questions</h3>

			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/question-form.jsp"
					class="btn btn-success">Add New Question</a>
			</div>

			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Srno</th>
						<th>Question</th>
						<th>Option1</th>
						<th>Option2</th>
						<th>Option3</th>
						<th>Option4</th>
						<th>CorrectAns</th>
						<th>Category</th>
						<th>Complexity</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="question" items="${listQuestion}">

						<tr>
							<td><c:out value="${question.srno}" /></td>
							<td><c:out value="${question.question}" /></td>
							<td><c:out value="${question.option1}" /></td>
							<td><c:out value="${question.option2}" /></td>
							<td><c:out value="${question.option3}" /></td>
							<td><c:out value="${question.option4}" /></td>
							<td><c:out value="${question.correctAns}" /></td>
							<td><c:out value="${question.category}" /></td>
							<td><c:out value="${question.complexity}" /></td>
							<td><a
								href="showEditForm?srno=<c:out value='${question.srno}' />">Edit</a><br>
								<br> <a
								href="delete?srno=<c:out value='${question.srno}' />">Delete</a>
							</td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>