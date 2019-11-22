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
			<h2>Boarding List Page</h2>
		</div>
	</div>
	

		
	<table>
		<tr>  
			<th>Yatak Numarasi</th>
			<th>Yatak Tipi</th>
			<th>Ne Zaman Bosalacak?</th>
			<th>Uygunluk</th>
			<th>Hayvanin Adi</th>
		</tr>
		<c:forEach var="tempBoarding" items="${boardings}">
				
			<!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/boarding/showBoardingFormForUpdate">
				<c:param name="boardingId" value="${tempBoarding.id}" />
			</c:url>					

			<!-- construct an "delete" link with customer id -->
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="boardingId" value="${tempBoarding.id}" />
			</c:url>					
					
			<tr>
				<td> ${tempBoarding.bedId} </td>
				<td> ${tempBoarding.bedType} </td>
				<td> ${tempBoarding.whenToBeAvailable} </td>
				<td> ${tempBoarding.availability} </td>
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
    
    	<input type="button" value="Add Boarding" 
			onclick = "window.location.href='showBoardingFormForAdd'; return false;"
			class = "button">
</body>
</html>
