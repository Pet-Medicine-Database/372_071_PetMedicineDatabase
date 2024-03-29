<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<style>
h2{
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: lightblue;
  color: black;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
table{
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}

</style>
</head>

<body>
<div id = "wrapper">
	<div id = "header">
		<h2>Evcil Hayvan Ekleme Sayfasi</h2>
	</div>
</div>

<div id ="container">
	
	<form:form action = "saveAnimal" modelAttribute="animal" method = "POST">
	<form:hidden path="animalId"/> 
	
	<table>
		<tbody>
			<tr>
				<td><label>Name:</label> </td>
				<td><form:input type = "text" path="name" /></td>
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
				<td><label>Hayvanin Sahibi:</label> </td>
				<td>
					<form:select path="owner">
						<form:options items="${owners}"/>
					</form:select>
				</td>
			</tr>

			<tr>
				<td><label>Hayvanin Veterineri:</label> </td>
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
