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

	<style>
	.container{
		border:2px solid black;
		width: 540px;
		background-image: url("img/estadi.jpg");
		height: 380px;
		background-size: 127%
	}
	.celda{
		display: inline-block;
		vertical-align: top;
	}
		
	.info{
		margin: auto;
		width: 200px;
	}
	ol{
	 	padding-left: 40px;
	 	display: inline-block;
	 	padding-left: 40px;/
   		font-size: 12pt;
    	columns: 2;
    	margin-left: 80px;
    	margin-top: 60px;
    	background-image: url("img/soccer.jpg");
    	background-size: 100%;
    	    background-size: 100%;
    padding-top: 10px;
    padding-bottom: 10px;
    padding-right: 10px;
	}
	li{
		color: white;
	}
	.dos{
		margin-left: 80px;
    margin-top: 55px;
	}
	.uno{
		    margin-bottom: 30px;
    margin-top: 60px;
    margin-left: 15px;
	}

	</style>
	<div class="container">
		<div class="celda">
			<img class="uno" src="img/${fequipo}"> <br> <img class="dos" src="img/${fescudo}">
		</div>

		<div class="celda info">

			<ol>										
				<c:forEach var="jugadores" items="${jugadores}">
		
				
					<li>${jugadores.nombre}</li>
				
				</c:forEach>
			</ol>
		</div>
			
	</div>	

</body>
</html>