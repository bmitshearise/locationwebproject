<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Locations: </h2>
	<table border="1">
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