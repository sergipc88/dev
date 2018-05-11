<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<style>
	body{
		height: 400px;
		display: flex;
	}
		.container{
			text-align: center;
			margin: auto;
			display: flex;
		}

		.tabla{
			width: 400px;
		}
		.ids{
			text-decoration: none;
		}

	</style>
<div class="container">

	<table border="1px solid black" class="tabla">
		<c:forEach var="pacientes" items="${pacientes}">



			<tr>
			<td><a class="ids" href="Seur?action=consultaPaciente&id=${pacientes.id_paciente}">${pacientes.id_paciente}</a></td>
				<td >${pacientes.nombre}</td>
				<td>${pacientes.apellido}</td>
				<td> <fmt:formatDate pattern="dd-MM-yyyy" value="${pacientes.fecha}"/> </td>
					

			</tr>		
		
		</c:forEach>
	</table>

</div>

</body>
</html>