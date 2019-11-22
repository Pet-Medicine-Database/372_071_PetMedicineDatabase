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


<div id ="container">
	<h2>Veteriner Kaydetme Sayfasi</h2>
	<form:form action = "saveVet" modelAttribute="vet" method = "POST">
	<form:hidden path="vetTCNo"/> 
	
	<table>
		<tbody>
			<tr>
				<td><label>Isim:</label> </td>
				<td><form:input type = "text" path="name"/></td>
			</tr>
			<tr>
				<td><label>Baslama Tarihi:</label> </td>
				<td><form:input type = "date" path="startDate"/></td>
			</tr>
			<tr>
				<td><label>Uzmanligi:</label> </td>
				<td><form:input path="expertise"/></td>
			</tr>
			<tr>
				<td><label>TC No:</label> </td>
				<td><form:input path="vetTCNo"/></td>
			</tr>
			
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Kaydet" class="save" /></td>
			</tr>
		</tbody> 
	
	</table>	
	</form:form>
	
</div>
</body>
</html>
