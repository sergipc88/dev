<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
	body{
	margin: auto;
	width: 100%;
	}
		.container{
			text-align: center;
			background-color: yellow;
			width: 600px;
			border: 2px solid black;
			margin: auto;
		}



	</style>
	<div class="container">
		<form action="Seur">
			
			<input type="text" name="invitado" placeholder="inserta el nombre">
			<input type="hidden" name="action" value="baja">
			<input type="submit">
		</form>



	</div>
</body>
</html>