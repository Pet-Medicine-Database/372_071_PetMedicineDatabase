<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Examination list</title>
</head>
<body>
<h1> Examination list </h1>
This page is under construction.

<table>
	<tr>
 	<th>Tarih</th>
 	<th>Evcil Hayvan</th>
 	<th>Sorumlu Veteriner</th>
 	<th>Sahibi</th>
	</tr>
	
	<c:forEach var="tempExamination" items="${examinations}">
	<tr>
				<td> ${tempExamination.appointmentDate} </td>
				<td> ${tempExamination.animal.name} </td>
				<td> ${tempExamination.vet.name} </td>
				<td> ${tempExamination.owner.name}</td>
	</tr>
	</c:forEach>
</table>


</body>
</html>