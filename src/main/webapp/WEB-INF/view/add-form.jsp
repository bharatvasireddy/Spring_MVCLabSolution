<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill the Student Details</h1>

				<form action="save" method="post">
					<div class="form-group">
						<label for="name">Student Name</label>
						<!-- name="name" should match from bean table -->
						<input type="text" class="form-control" id="name" name="name"
							placeholder="Enter student name">
					</div>

					<div class="form-group">
						<label for="department">Department</label> <input type="text"
							class="form-control" id="department" name="department"
							placeholder="Enter Department">
					</div>

					<div class="form-group">
						<label for="country">Country</label> <input type="text"
							class="form-control" id="country" name="country"
							placeholder="Enter Country here">
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>

						<button type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>

			</div>
		</div>

	</div>



</body>
</html>