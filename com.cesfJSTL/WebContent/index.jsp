<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.cesfJSTL.Libro"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>prueva JSTL</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
</head>
<body>



	<% Libro libro =(Libro)request.getAttribute("libro");  %>
	<%=libro.getTitulo()%>
	<%= libro.getPrecio() %>
	<br> ${libro.titulo} ${libro.precio}
	<br>
	<h1>
		<c:out value="${libro.titulo} ${libro.precio}  " />
	</h1>



</body>
</html>