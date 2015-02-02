<%@page
	contentType="text/html"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/
	bootstrap.min.css"
	rel="stylesheet">
</head>
<html>
<head>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello World!</h1>
	<p>This is the homepage!</p>
	<form
		action="${pageContext.request.contextPath}/"
		method="POST">
		<label>${personA.name} Scope:Prototype </label> <input
			name="prototypeName"
			type="text"
			class="form-control"
			value="${personA.clickCount}" /> <label>${personB.name} Scope:Singleton</label> <input
			name="singletonName"
			type="text"
			class="form-control"
			value="${personB.clickCount}" />
		<div>
			<button class="btn btn-primary btn-lg">Click Count</button>
		</div>
	</form>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
