<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.jacaranda.prueba.Prueba" %>
<%@ page import = "com.jacaranda.dao.PruebaDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prueba</title>
</head>
<body>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	String nombre = request.getParameter("nombre");
	
	//Creo el objeto prueba con los parámetros obtenidos e importo la clase
	Prueba p = new Prueba(id, nombre); 
	 
	PruebaDao pd = new PruebaDao();
	
	boolean result = pd.addPrueba(p);
	
	String mensaje = "";
	if (result) {
		mensaje = "Añadido a la base de datos";
	}else {
		mensaje = "No se ha podido añadir a la base da datos";
	}
	%>	
	<div><%=mensaje%></div>

</body>
</html>