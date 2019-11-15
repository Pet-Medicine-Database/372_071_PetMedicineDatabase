<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animal list</title>
</head>
<body>
<h1> Animal list</h1>
This page is under construction.

<br><br>

	<div id="wrapper">
		<div id="header">
			<h2>Animal List Page</h2>
		</div>
	</div>
	

	<input type="button" value="Add Animal"
					   onclick="window.location.href='showAnimalFormForAdd'; return false;"
					   class="add-button"/>
					   
	<table>
		<tr>
			<th>Ismi</th>
			<th>Cinsi</th>
			<th>Turu</th>
			<th>Sahibinin Ismi</th>
			<th>Sahibinin mail adresi</th>
			<th>Sorumlusu olan veteriner</th>
		</tr>
				
		<!-- loop over and print our customers -->
		<c:forEach var="tempAnimal" items="${animals}">
				
			<!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/animal/showFormForUpdate">
				<c:param name="animalId" value="${tempAnimal.id}" />
			</c:url>					

			<!-- construct an "delete" link with customer id -->
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="animalId" value="${tempAnimal.id}" />
			</c:url>					
					
			<tr>
				<td> ${tempAnimal.name} </td>
				<td> ${tempAnimal.age} </td>
				<td> ${tempAnimal.genus} </td>
				<td> ${tempAnimal.vet.name}</td>
						
				<td>
					<!-- display the update link -->
					<a href="${updateLink}">Update</a>
							|
					<a href="${deleteLink}"
					   onclick="if (!(confirm('Are you sure you want to delete this animal?'))) return false">Delete</a>
				</td>
					
			</tr>
				
		</c:forEach>
						
	</table>
					  
					  

</body>
</html>