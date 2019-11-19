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
			<tr>
				<td>Yatiliya basladigi gun: </td>
				<td>Ucreti: </td>
				<td>Saati: </td>
				<td>Karar veren veteriner: </td>
				<td>Ne zaman ayrilacagi: </td>
			</tr>
		<c:forEach var="tempBoarding" items="${animal.boardingList}">	
			<tr>
				<td> ${tempBoarding.appointment.appointmentDate} </td>
				<td> ${tempBoarding.appointment.price} </td>
				<td> ${tempBoarding.appointment.appointmentHour} </td>
				<td> ${tempBoarding.appointment.vet.name}</td>
				<td> ${tempBoarding.whenToBeAvailable}</td>
			</tr>
		</c:forEach>
		
		</table>
		</div>
		
		<div id = "examinationsArea">
									
		<table>
			<tr>
				<td>Muayene gunu: </td>
				<td>Muayene ucreti: </td>
				<td>Muayene saati: </td>
				<td>Muayeneyi yapan veteriner: </td>
			</tr>
		
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
		
		<div id = "vaccinessArea">
									
		<table>
			<tr>
				<td>Uygulanan asi: </td>
			</tr>
			<c:forEach var="tempVaccine" items="${animal.vaccineList}">	
				<tr>
					<td> ${tempVaccine.name} </td>
				</tr>
			</c:forEach>
			
		</table>
		</div>
	</div>
</body>
</html>