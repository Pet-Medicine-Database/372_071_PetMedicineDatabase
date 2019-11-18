<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Boarding list</title>
</head>
<body>
<h1> Boarding list</h1>
	<br><br>
	
	<div id = "wrapper">
		<div id = "header">
			<h2>Boarding List Page</h2>
		</div>
	</div>
	
	<input type="button" value="Add Boarding" 
			onclick = "window.location.href='showBoardingFormForAdd'; return false;"
			class = "add-button">
		
	<table>
		<tr>  
			<th>Yatak Numarasi</th>
			<th>Yatak Tipi</th>
			<th>Ne zaman bosalacak?</th>
			<th>Uygunluk</th>
			<th>Hayvanin adi</th>
		</tr>
		<c:forEach var="tempBoarding" items="${boardings}">
				
			<!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/boarding/showBoardingFormForUpdate">
				<c:param name="boardingId" value="${tempBoarding.id}" />
			</c:url>					

			<!-- construct an "delete" link with customer id -->.
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="animalId" value="${tempBoarding.id}" />
			</c:url>					
					
			<tr>
				<td> ${tempBoarding.bedId} </td>
				<td> ${tempBoarding.bedType} </td>
				<td> ${tempBoarding.whenToBeAvailable} </td>
				<td> ${tempBoarding.availability} <td>
				<td> ${tempBoarding.animal.name}</td>
						
				<td>
					<!-- display the update link -->
					<a href="${updateLink}">Update</a>
							|
					<a href="${deleteLink}"
					   onclick="if (!(confirm('Are you sure you want to delete this boarding?'))) return false">Delete</a>
				</td>	
			</tr>	
		</c:forEach>	
	</table>
</body>
</html>