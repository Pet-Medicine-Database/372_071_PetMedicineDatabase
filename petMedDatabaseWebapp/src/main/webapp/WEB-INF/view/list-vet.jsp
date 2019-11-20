<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vet list</title>
</head>
<body>
<h1> Vet list </h1>
<div id = "wrapper">
		<div id = "header">
			<h2>Owner List Page</h2>
		</div>
	 </div>
	 
	 
	 <input type="button" value="Add Vet" 
		onclick = "window.location.href='showVetFormForAdd'; return false;"
		class = "add-button">
		
	<table> 
		<tr>
			<th>Ismi</th>
			<th>Baslama Tarihi</th>
			<th>Uzmanligi</th>
			<th>TC Kimlik Numarasi</th>
			<th>Hasta Sayisi</th>
			<th>Sorumlu oldugu hayvanlar</th>
		<tr>
		
		<c:forEach var="tempVet" items="${vetList}">
				
			<!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/vet/showVetFormForUpdate">
				<c:param name="ownerId" value="${tempVet.ownerTCNo}" />
			</c:url>					

			<!-- construct an "delete" link with customer id -->.
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="animalId" value="${tempVet.ownerTCNo}" />
			</c:url>					
					
			<tr>
				<td> ${tempVet.name} </td>
				<td> ${tempVet.startDate} </td>
				<td> ${tempVet.expertise} </td>
				<td> ${tempVet.vetTCNo} </td>
				<td> ${tempVet.numberOfPatients} <td>
				<td> 
					<table>
						<c:forEach var="tempAnimal" items = "${tempVet.animalList}">
							<tr> 
								<td> ${tempAnimal.name}</td>
							</tr>
						</c:forEach>		
					 </table>
				</td>			
				<td>
					<!-- display the update link -->
					<a href="${updateLink}"><img src='<c:url value = "path"/>'></a>
							|
					<a href="${deleteLink}"
					   onclick="if (!(confirm('Are you sure you want to delete this boarding?'))) return false">Delete</a>
				</td>	
			</tr>	
		</c:forEach>
	</table>

</body>
</html>