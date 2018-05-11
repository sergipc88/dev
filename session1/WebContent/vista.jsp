<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<style>
		h1{
			text-align: center;
			color: blue;
			font-weight: bold; 
		}
		.cerrar{
			border: 2px solid black;
			text-decoration: none;
			background:#e0e0e0;
			border-radius: 2px;
			color: black;
			padding:5px;
		}

		.container{
			text-align: center;
			margin-top: 100px;
		}
	</style> 
</head>
<body>
<h1>La aventura de sumar</h1>
<div class="container">
	<form action="Seur" method="post">
		<input type="text" name="elemento1">
		<input type="text" name="elemento2">
		<input type="submit" value="sumar">
	</form>
	
	
	
	<br>
	
	
<label for="request">Suma request</label> <input type="text" name="request" value="${resultado}">      
<label for="sesion">Suma Sesion</label><input type="text" name="sesion" value="${sumaSe}">
<label for="aplication">Suma Aplication</label> <input type="text" name="aplication" value="${app}">
<br>
<br>
<a class="cerrar" 	href="Seur?action=cerrar">Cerrar sesión</a>

<br>
<br>
<img src="sumar3.jpg" >



</div>
	
</body>
</html>	