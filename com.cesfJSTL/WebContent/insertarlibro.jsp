<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>insertamelo papi</title>
</head>
<body>
<form action="#">
	<input type="text" name="title">
	<input type="text" name="price">
	<c:if test="${param.boton!=null}">
Boton pulsado!!
</c:if>
	<input type="submit" name="boton" value="boton">	
	

	

	
</form>
</body>
</html>