<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<style>

img{
	display: block;
 	margin-left: 200px;
}
table {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #ddd;
    padding: 8px;
}

table tr:nth-child(even){background-color: #f2f2f2;}

table tr:hover {background-color: #ddd;}

table  {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: lightblue;
    color: black;
}

h2{
	
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}
p{
	margin-top: 30px;
    
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}

</style>
</head>
<body>

<div>
<h2>Show Animal</h2>

</div>
<div id = "wrapper">
	<div id = "header">
		<p>Evcil Hayvanin Ismi: ${animal.name}</p>
	</div>
</div>

<div id = "container">
	<div id = "ownerArea">
		<p>Evcil Hayvanin Sahibinin Ismi: ${animal.owner.name}</p>
		<p>Evcil Hayvanin Sahibinin E-Mail Adresi: ${animal.owner.email}</p>
	</div>

	<p>Yatili Bilgileri</p>
	<div id = "boardingsArea">							
		<table>
			<tr>
				<td>Yatiliya Basladigi Gun </td>
				<td>Ucreti </td>
				<td>Saati </td>
				<td>Karar Veren Veteriner </td>
				<td>Ne Zaman Ayrilacagi </td>
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
    
	<p>Muayene Bilgileri</p>	
	<div id = "examinationsArea">
									
		<table>
			<tr>
				<td>Muayene Gunu </td>
				<td>Muayene Ucreti </td>
				<td>Muayene Saati </td>
				<td>Muayeneyi Yapan Veteriner </td>
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
        
	<p>Asi Bilgileri </p>
	<div id = "vaccinessArea">
									
		<table>
			<tr>
				<td>Uygulanan Asi </td>
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