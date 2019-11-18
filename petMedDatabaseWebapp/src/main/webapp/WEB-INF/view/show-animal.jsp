<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<p>${animal.name}</p>
		</div>
	</div>
	
	<div id = "container">
		<div id = "ownerArea">
			<p>${animal.owner.name}</p>
			<p>${animal.owner.email}</p>
		</div>
		
		<div id = "boardingsArea">
									
		<table>
		<c:forEach var="tempBoarding" items="${animal.boardingList}">	
			<tr>
				<td> ${tempBoarding.appointment.appointmentDate} </td>
				<td> ${tempBoarding.appointment.price} </td>
				<td> ${tempBoarding.appointment.appointmentHour} </td>
				<td> ${tempBoarding.appointment.vet.name}</td>
			</tr>
		</c:forEach>
		
		</table>
		</div>
		
		<div id = "examinationsArea">
									
		<table>
		<c:forEach var="tempExamination" items="${animal.examinationList}">	
			<tr>
				<td> ${tempExamination.appointment.appointmentDate} </td>
				<td> ${tempExamination.appointment.price} </td>
				<td> ${tempExamination.appointment.appointmentHour} </td>
				<td> ${tempExamination.appointment.vet.name}</td>
			</tr>
		</c:forEach>
		
		</table>
		</div>
	
	
	</div>



</body>
</html>