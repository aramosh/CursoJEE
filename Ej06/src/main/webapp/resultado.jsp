<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pasa por caja</title>
</head>
<body>
	<h1>Este es tu pedido ${requestScope.cliente.nombre}</h1>
	<p>Tamaño: ${requestScope.cliente.pizza.size}</p>
	<p>Ingredientes: ${requestScope.cliente.pizza.ingredientes }</p>
	<p>En total son <span style="color:red">${requestScope.cliente.pizza.price} Euros</span></p>
</body>
</html>