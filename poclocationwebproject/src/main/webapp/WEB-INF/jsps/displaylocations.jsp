<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<script src=https://code.jquery.com/jquery-3.6.0.js></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<h2>Locations: </h2>
	<table border="1" class="table table-bordered">
		<tr>
			<th>pincode</th>
			<th>district</th>
			<th>taluka</th>
			<th>place name</th>
			<th>type</th>
		</tr>
		<c:forEach items="${locations}" var="location">
			<tr>
				<td>${location.getPincode()}</td>
				<td>${location.getDistrict()}</td>
				<td>${location.getTaluka()}</td>
				<td>${location.getName()}</td>
				<td>${location.getType()}</td>
				<td><a href="deletelocation?pincode=${location.getPincode()}">delete</a></td>
				<td><a href="updatelocation?pincode=${location.getPincode()}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="showcreate">Add Location</a>
</body>
</html>