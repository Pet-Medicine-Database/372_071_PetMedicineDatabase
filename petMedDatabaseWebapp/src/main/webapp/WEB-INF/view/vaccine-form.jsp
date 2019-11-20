<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id = "wrapper">
	<div id = "header">
		<h2>HELLO WORLD!</h2>
	</div>
</div>

<div id ="container">
	<h3>Save Animal</h3>
	<form:form action = "saveVaccine" modelAttribute="vaccine" method = "POST">
	<form:hidden path="serialNumber"/> 
	
	<table>
		<tbody>
			<tr>
				<td><label>Name:</label> </td>
				<td><form:input type = "text" path="name"/></td>
			</tr>
			<tr>
				<td><label>expiration date:</label> </td>
				<td><form:input type = "date" path="expirationDate"/></td>
			</tr>
			<tr>
				<td><label>Stock:</label> </td>
				<td><form:input path="stock"/></td>
			</tr>
			<tr>
				<td><label>Age:</label> </td>
				<td><form:input path="serialNumber"/></td>
			</tr>
			
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>
		</tbody> 
	
	</table>	
	</form:form>
	
</div>
</body>
</html>