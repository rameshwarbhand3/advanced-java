<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
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
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">

			<table class="table table-bordered">
				<c:if test="${listQuestion != null && listQuestion.size()>0}">
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
						</tr>
					</thead>
				</c:if>
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
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>