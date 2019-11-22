<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
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

table th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: lightblue;
    color: black;
}
.button {
    background-color: lightblue;
    border: none;
    color: black;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

h2{
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}
</style>
</head>
<body>	
	<div id = "wrapper">
		<div id = "header">
			<h2>Owner List Page</h2>
		</div>
	 </div>
	 
	 
	
	<table> 
		<tr>
			<th>Ismi</th>
			<th>Meslegi</th>
			<th>Adresi</th>
			<th>TC Kimlik Numarasi</th>
			<th>Telefon Numarasi</th>
			<th>Sahiplendigi Hayvanlar</th>
		<tr>
		
		<c:forEach var="tempOwner" items="${ownerList}">
				
			<!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/owner/showOwnerFormForUpdate">
				<c:param name="ownerId" value="${tempoOwner.ownerTCNo}" />
			</c:url>					

			<!-- construct an "delete" link with customer id -->
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="animalId" value="${tempoOwner.ownerTCNo}" />
			</c:url>					
					
			<tr>
				<td> ${tempOwner.name} </td>
				<td> ${tempOwner.job} </td>
                <td> ${tempOwner.address} </td>
				<td> ${tempOwner.ownerTCNo} </td>
				<td> ${tempOwner.phoneNumber} </td>
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
					   onclick="if (!(confirm('Are you sure you want to delete this owner?'))) return false">Delete</a>
				</td>	
			</tr>	
		</c:forEach>
	</table>
    
     <input type="button" value="Add Owner" 
		onclick = "window.location.href='showOwnerFormForAdd'; return false;"
		class = "button">
		
</body>
</html>
