<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Seur" id="formulario">
<table border="1px solid black">
	<tr>
		<th>id</th>
		<th>Nombre</th>
		<th>Precio</th>
	</tr>
	<c:forEach var="lista" items="${libros}">
		<tr>
			<td>${lista.id_Libro}</td>
			<td><input type="text" id="campName${lista.id_Libro}" value="${lista.titulo}"></td>
			<td><input type="text" id="campPrice${lista.id_Libro}" value="${lista.precio}"></td>
			<td><input type="button" value="modificar" onclick="modificar(${lista.id_Libro})">
				<input type="button" value="eliminar" onclick="eliminar(${lista.id_Libro})"></td>
		</tr>

	</c:forEach>

	<tr>
		<td>Nuevo</td>
		<td><input type="text" placeholder="inserta nombre" name="tituloAlta"></td>
		<td><input type="text" placeholder="inserta el precio" name="precioAlta"></td>
		<td><input type="submit" value="alta"></td>
	</tr>
</table>
	<input type="hidden" name="action" value="alta" id="action">

	<input type="hidden" name="id_libro" value="id_libro" id="id_libro">
	<input type="hidden" name="nombre" value="alta" id="nombre">
	<input type="hidden" name="precio" value="alta" id="precio">
</form>





<script type="text/javascript">
	
	function modificar(id_libro){

		document.getElementById('action').value="modificar";
		document.getElementById('id_libro').value=id_libro;
		var nombreMod = document.getElementById('campName'+id_libro).value;
		var priceMod = document.getElementById('campPrice'+id_libro).value;
		document.getElementById('nombre').value=nombreMod;
		document.getElementById('precio').value=priceMod;
		document.getElementById("formulario").submit();		
	}

	function eliminar(id_libro){

		document.getElementById('action').value="eliminar";
		document.getElementById('id_libro').value=id_libro;
		document.getElementById("formulario").submit();		
	}






</script>

</body>
</html>