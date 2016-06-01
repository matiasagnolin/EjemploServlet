<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="Style/aplication.css" rel="stylesheet"> 
<script type="text/javascript" src="Scripts/index.js"></script>

<title>Servlets - Aplicacion de ejemplo</title>
</head>
<body>
	<div>
		<form action="${pageContext.request.contextPath}/Ejemplo"
			method="post">
			<fieldset>
				<legend>Alta de estudiantes</legend>
				<div class="divContenedor">
					<label for="inputNombre">Nombre:</label> <input type="text"
						name="inputNombre" id="inputNombre">
				</div>
				<div class="divContenedor">
					<label for="inputApellido">Apellido:</label> <input type="text"
						name="inputApellido" id="inputApellido">
				</div>
				<div class="divContenedor">
					<input type="submit" value="Nuevo Alumno"
						onclick="return validarSubmit();">
				</div>
			</fieldset>
		</form>
	</div>
	<br>
	<div>
		<table>
			<thead>
				<tr>
					<th colspan="2">Alumnos</th>
				</tr>
				<tr>
					<th>Apellido</th>
					<th>Nombre</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${Alumnos == null }">
					<tr><td colspan="2">No se encontraron alumnos</td></tr>
				</c:if>
				<c:forEach items="${Alumnos}" var="alumno">
					<tr>
						<td>${alumno.apellido }</td>
						<td>${alumno.nombre }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>