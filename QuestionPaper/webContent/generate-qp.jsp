<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select question</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!--  <script type="text/javascript" src="${pageContext.request.contextPath}/js/generate-criteria.js"></script>-->

</head>
<body>
	<form id="criteriaForm" onclick="return doForm()">
		<h4>Select a Criteria</h4>
		<hr>
		<fieldset>
			<label>Number of Questions : <input type="number"
				name="number" min="0" max="100" step="1" value="1"></label> <br />
		</fieldset>

		<fieldset class="form-group">
			<label>Category <select name="category">
					<option>GK</option>
					<option>Science</option>
					<option>History</option>
					<option>Geography</option>
			</select>
			</label>
		</fieldset>

		<fieldset class="form-group">
			<label>Complexity</label> <select name="complexity">
				<option>Simple</option>
				<option>Medium</option>
				<option>Complex</option>
			</select>
		</fieldset>

		<br />
		<button type="submit" onclick="addCriteria()">Add Criteria</button>
	</form>
	<hr>

	<button type="submit" onclick="generateQuestionPaper()">Generate
		Question Paper</button>

	<jsp:include page="generated-question-paper-set.jsp" />

	<script>
	    let template = [];
	    function doForm() {
	    	return false;
	    }
		function addCriteria() {
			let criteriaForm = document.getElementById("criteriaForm");
			var data = new FormData(criteriaForm);
			
			var criteria = {};
			data.forEach((value, key) => criteria[key] = value);
			var json = JSON.stringify(criteria);
			template.push(criteria)
			console.log(JSON.stringify(template))
			alert("Do you want to more criteria?");
		}
		function generateQuestionPaper(){
			fetch("/QuestionPaper/showByCriteria", { method:"post", body:JSON.stringify(template) })
			  .then(res => {
				  console.log("showByCriteria returns status Success, statuCode:"+res.status);
				  alert("The question papare has been generated successfully as per template added");
			  })
			  .then(txt => console.log(txt))
			  .catch(err => console.error(err));

		}
	</script>

</body>
</html>