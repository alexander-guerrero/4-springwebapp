<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
<script type="text/javascript" src='<c:url value="/resources/js/jquery-3.5.1.min.js" />'></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		jQuery('.confirmacion').on('click', function() {
			return confirm('¿Realmente deseas eliminar el registro?');
		});
	});
</script>
</head>
<body>

	<h1>Index.jsp</h1>
	
	<a href='<c:url value="/about" />'>About</a> |
	<a href='<c:url value="/admin" />'>Admin</a>
	
	<p>
		Respuesta luego de enviar el formulario (Guardar o Modificar) o Eliminar un registro:
		<c:out value="${respuesta}" />
	</p>

	<table border="">
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Cargo</th>
			<th>Fecha de Creación</th>
			<th colspan="2">Acción</th>
		</tr>
		<!-- Iteración mediante JSTL y EL (Expression Language) -->
		<c:forEach items="${adminLista}" var="admin">
			<tr>
				<td><c:out value="${admin.idAdm}"></c:out></td>
				<td><c:out value="${admin.nombre}"></c:out></td>
				<td><c:out value="${admin.cargo}"></c:out></td>
				<td><c:out value="${admin.fechaCreacion}"></c:out></td>
				<td><a href='<c:url value="admin/${admin.idAdm}/update" />'>Modificar</a></td>
				<td><a class="confirmacion" href='<c:url value="admin/${admin.idAdm}/delete" />'>Eliminar</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>