<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pasa por caja</title>
</head>
<body>

	<h1>Este es tu pedido ${sessionScope.pedido.cliente.nombre}</h1>
	<c:forEach var="p" items="${sessionScope.pedido.pizzas }">
		<p>Tamaño: <c:out value="${ p.size}"></c:out></p>
		<ul>
			<c:forEach var="i" items="${ p.ingredientes}">
				<li><c:out value="${i}"></c:out></li>
			</c:forEach>
		</ul>
		<p>Precio: <c:out value="${p.price}"></c:out></p>
	</c:forEach>
	<p>En total son <span style="color:red">${sessionScope.pedido.pedirCuenta()} Euros</span></p>
</body>
</html>