<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--<form action="Seur">
		<c:forEach var="paciente" items="${paciente}">
		<input type="hidden" name="id" value="${paciente.id_paciente}">
		<input type="text" name="nombre" value="${paciente.nombre}">
		<input type="text" name="apellido" value="${paciente.apellido}">
		<input type="date" name="fecha" value="${paciente.fecha}">
		</c:forEach>
		<input type="hidden" name="action" value="modificar">
		<input type="submit" value="modificar">
	</form>-->

<!-- 
	<form action="modificar">
	<s:iterator value="libro">
	<input type="hidden" name="libro.id_Libro" value="<s:property value='id_Libro'/>">
	<input type="text" name="libro.titulo" value="<s:property value='titulo'/>" >
	<input type="text" name="libro.precio" value="<s:property value='precio'/>" >
	<input type="submit" value="modificar">
	</s:iterator>
	</form> -->
	
	<s:form method="post">
	<s:hidden  name="libro.id_Libro" value="%{libro.id_Libro}" />
	<s:textfield  name="libro.titulo" value="%{libro.titulo}" />
	<s:textfield  name="libro.precio" value="%{libro.precio}" />	
	<s:submit action="modificar" value="modificar"  />
	<s:submit  action="eliminar" value="eliminar"  />
	</s:form>
	
	
</body>
</html>

	