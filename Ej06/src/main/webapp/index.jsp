<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizzeria</title>
<style type="text/css">
	label{
		display: block;
	}
</style>
</head>
<body>
	<form action="PedidoServlet" method="get">
		<label for="nombre">Nombre Completo: <input type="text" name="nombre"></label>
		<fieldset>
			<legend>Seleccione el tamaño de su pizza.</legend>			
			<label for="peque"><input id="peque" type="radio" name="size" value="peque" checked> Pequeña</label>			
			<label for="mediana"><input id="mediana" type="radio" name="size" value="mediana"> Mediana</label>			
			<label for="grande"><input id="grande" type="radio" name="size" value="grande"> Grande</label>
		</fieldset>
		<fieldset>
			<legend>Seleccione sus ingredientes</legend>
			<label><input type="checkbox" name="ingredientes" value="Anchoas"> Anchoas</label>
			<label><input type="checkbox" name="ingredientes" value="Aceitunas"> Aceitunas</label>
			<label><input type="checkbox" name="ingredientes" value="Queso"> Queso</label>
			<label><input type="checkbox" name="ingredientes" value="Brócoli"> Brócoli</label>
		</fieldset>
		<input type="submit" value="Pedir Pizza">
	</form>
</body>
</html>