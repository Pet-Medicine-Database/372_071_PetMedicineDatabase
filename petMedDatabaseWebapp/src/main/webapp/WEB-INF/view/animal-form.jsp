<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hayvancik</title>
<!-- Some css to here -->


</head>
<body>
<div id = "wrapper">
	<div id = "header">
		<h2></h2>
	</div>
</div>

<div id ="container">
	<h3>Save Animal</h3>
	<form:form action = "saveAnimal" modelAttribute="animal" method = "POST">
	<%-- <form:hidden path="id"/> --%>
	
	<table>
		<tbody>
			<tr>
				<td> <label>Isim</label></td>
				<%-- <td><form:input path="name"/> --%>
			</tr>
			<tr>
				<td> <label>Tur</label></td>
				<%-- <td><form:input path="type"/> --%>
			</tr>
			<tr>
				<td> <label>Cins</label></td>
				<%-- <td><form:input path="genus"/> --%>
			</tr>
			<tr>
				<td> <label>Yas</label></td>
				<%-- <td><form:input path="age"/> --%>
			</tr>
			<tr>
				<td> <label>Vet</label></td>
				<%-- <td> <form:select path="vet">
					<form:option value="NONE" label = "--- Birini Seciniz ---"/>
					<form:options value = "${vetList}"/>
				</form:select></td> --%>
			</tr>
				
		</tbody>
	
	</table>
	
	
	
	
	</form:form>
	
	
	
	
	
	
</div>




</body>
</html>