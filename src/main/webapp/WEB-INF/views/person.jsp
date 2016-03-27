<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Spring Transaction Test Page</title>
</head>
<body>
	<div class="container">
		<h2>Basic Table</h2>
		<p>The .table class adds basic styling (light padding and only
			horizontal dividers) to a table:</p>
		<table class="table">
			<thead>
				<tr>
					<th>TC No</th>
					<th>Name</th>
					<th>Surname</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="person" items="${persons}">
					<tr>
						<td>${person.tckNo}</td>
						<td>${person.name}</td>
						<td>${person.surname}</td>
						<td><a
							href="${pageContext.request.contextPath}/transaction/update/${person.id}">Update
								Person</a><br> <a
							href="${pageContext.request.contextPath}/transaction/delete/${person.id}">Delete
								Person</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form action="${pageContext.request.contextPath}/transaction"
			method="POST">
			<label>TCK No : </label> <input name="tckNo" type="text"
				class="form-control" /> <label>Person Name : </label> <input
				name="name" type="text" class="form-control" /> <label>Person
				Surname : </label> <input name="surname" type="text" class="form-control" />
			<div>
				<button class="b	tn btn-primary btn-lg">Create Person</button>
			</div>
		</form>
	</div>

</body>
</html>
