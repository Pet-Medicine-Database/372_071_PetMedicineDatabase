<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner List</title>
</head>
<body>	
	<div id = "wrapper">
		<div id = "header">
			<h2>Owner List Page</h2>
		</div>
	 </div>
	 
	 
	 <input type="button" value="Add Owner" 
		onclick = "window.location.href='showOwnerFormForAdd'; return false;"
		class = "add-button">
		
	<table> 
		<tr>
			<th>Ismi</th>
			<th>Isi</th>
			<th>Adresi</th>
			<th>TC Kimlik Numarasi</th>
			<th>Telefon Numarasi</th>
			<th>Sahiplendigi hayvanlar</th>
		<tr>
		
		<c:forEach var="tempOwner" items="${ownerList}">
				
			<!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/owner/showOwnerFormForUpdate">
				<c:param name="ownerId" value="${tempoOwner.ownerTCNo}" />
			</c:url>					

			<!-- construct an "delete" link with customer id -->.
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="animalId" value="${tempoOwner.ownerTCNo}" />
			</c:url>					
					
			<tr>
				<td> ${tempOwner.name} </td>
				<td> ${tempOwner.job} </td>
				<td> ${tempOwner.ownerTCNo} </td>
				<td> ${tempOwner.phoneNumber} <td>
				<td> 
					<table>
						<c:forEach var="tempAnimal" items = "${tempOwner.ownedAnimals}">
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