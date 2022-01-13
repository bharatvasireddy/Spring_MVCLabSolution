<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to college Fest App</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Name</th>
							<th scope="col">Department</th>
							<th scope="col">Country</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<!-- students taken from controller from home method -->
						<c:forEach items="${students}" var="sd">
							<tr>
								<th scope="row">${sd.id}</th>
								<td>${sd.name}</td>
								<td>${sd.department}</td>
								<td>${sd.country}</td>
								<td>
								<!-- from controller delete handle request mapping url -->
									<a href="delete/${sd.id}"><i class="far fa-trash-alt text-danger"></i></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center">
					<a href="add-student" class="btn btn-outline-success">New Student</a>
				</div>



			</div>
		</div>
	</div>

</body>

</html>