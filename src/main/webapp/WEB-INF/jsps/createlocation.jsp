<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<form action="saveloc" method="POST">
pincode: <input type="text" name="pincode">
District: <input type="text" name="district">
Taluka: <input type="text" name="taluka">
Place: <input type="text" name="name">
Type: <input type="radio" name="type" value="URBAN"> URBAN 
	  <input type="radio" name="type" value="RURAL"> RURAL 
	  <input type="submit" value="save"> 
</form>
</pre>
${msg} 
<a href="displaylocations">View All</a>
</body>
</html>