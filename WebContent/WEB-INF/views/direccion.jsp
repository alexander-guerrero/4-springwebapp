<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
</head>
<body>

	<h1>Direccion.jsp</h1>
	
	<a href='<c:url value="/" />'>Home</a> |
	<a href='<c:url value="/about" />'>About</a>
	
	<sf:form action="${pageContext.request.contextPath}/direccion"
		method="post" commandName="direccion">
		<table>
			<tr>
				<td>Calle</td>
				<td><sf:input path="calle" /></td>
			</tr>
			<tr>
				<td>C.P.</td>
				<td><sf:input path="cp" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Guardar cambios" />
				</td>
			</tr>
		</table>
	</sf:form>
	
	<!-- Aquí irá una respuesta luego de guardar la dirección :) -->
	
	<h2>Direcciones de ${admin.nombre} - ${admin.cargo}</h2>
	
	<!-- Aquí irá una tabla con la lista de direcciones :) -->

</body>
</html>