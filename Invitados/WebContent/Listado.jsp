<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Insert title here</title>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<style>
	td{
		padding: 5px;
	}

</style>







<table border="2px">
	
<c:forEach var="invitado" items="${convidats}">
<tr>
	<td>${invitado.nombre}</td>
</tr>	

	<!-- <c:out value="${persona.nombre} ${persona.direccion} ${persona.dni}"></c:out> -->
</c:forEach>

</table>

</body>
</html>