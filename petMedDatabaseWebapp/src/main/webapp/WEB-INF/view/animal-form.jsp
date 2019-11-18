<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
		<h2>HELLO WORLD!</h2>
	</div>
</div>

<div id ="container">
	<h3>Save Animal</h3>
	<form:form action = "saveAnimal" modelAttribute="animal" method = "POST">
	<form:hidden path="animalId"/> 
	
	<table>
		<tbody>
			<tr>
				<td><label>Name:</label> </td>
				<td><form:input type = "text" path="name"/></td>
			</tr>
			<tr>
				<td><label>Type:</label> </td>
				<td><form:input path="type"/></td>
			</tr>
			<tr>
				<td><label>Genus:</label> </td>
				<td><form:input path="genus"/></td>
			</tr>
			<tr>
				<td><label>Age:</label> </td>
				<td><form:input path="age"/></td>
			</tr>
			
			<tr>
				<td><label>Hayvanin sahibi:</label> </td>
				<td>
					<form:select path="owner">
						<form:options items="${owner.name}"/>
					</form:select>
				</td>
			</tr>

			<tr>
				<td><label>Hayvanin veterineri:</label> </td>
				<td>
					<form:select path="vet">
						<form:options items="${vets}"/>
					</form:select>
				</td>
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