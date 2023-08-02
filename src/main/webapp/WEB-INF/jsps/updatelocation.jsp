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
<pre>
<form action="updateloc" method="POST">
pincode: <input type="text" name="pincode" value="${location.getPincode()}" readonly="readonly">
District: <input type="text" name="district" value="${location.getDistrict()}">
Taluka: <input type="text" name="taluka" value="${location.getTaluka()}">
Place: <input type="text" name="name" value="${location.getName()}">
Type: <input type="radio" name="type" value="URBAN" ${location.type='URBAN'?checked:''}> URBAN 
	  <input type="radio" name="type" value="RURAL" ${location.type='RURAL'?checked:''}> RURAL 
	  <input type="submit" value="save"> 
</form>
</pre>
</body>
</html>