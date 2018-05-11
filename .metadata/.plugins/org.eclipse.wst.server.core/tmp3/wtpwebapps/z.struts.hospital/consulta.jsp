<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <%@ taglib prefix="s" uri="/struts-tags"%>
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
	 	<tr>
	 		<th>id</th>
	 		<th>titulo</th>
	 		<th>precio</th>
	 		
	 	</tr>
		<s:iterator value="lista">
			<tr>
			<td><a href="mandarid.action?libro.id_Libro=<s:property value='id_Libro'/>"><s:property value="id_Libro"/></a></td>
				<td ><s:property value="titulo"/></td>
				<td><s:property value="precio"/></td>
			</tr>		
		
		</s:iterator>
	</table> 
	
	
	
	
	
	

</div>

</body>
</html>