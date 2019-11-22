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
	<div id="wrapper">
		<div id="header">
			<h2>Animal List Page</h2>
		</div>
	</div>

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
				
			  
			<c:url var="updateLink" value="/animal/showFormForUpdate">
				<c:param name="animalId" value="${tempAnimal.id}" />
			</c:url>					

			construct an "delete" link with customer id 
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="animalId" value="${tempAnimal.id}" />
			</c:url>
			
			<c:url var="showLink" value="/animal/showAnimal">
				<c:param name="animalId" value="${tempAnimal.id}" />
			</c:url>			  		
					
			<tr>
				<td> ${tempAnimal.name} </td>
				<td> ${tempAnimal.age} </td>
				<td> ${tempAnimal.genus} </td>
                <td>  ${tempAnimal.owner.email}</td>
                <td> ${tempAnimal.owner.name} </td>
				<td> ${tempAnimal.vet.name}</td>
						
				<td>
					 display the update link 
					<a href="${updateLink}">img_src</a>
							|
					<a href="${deleteLink}"
					   onclick="if (!(confirm('Are you sure you want to delete this animal?'))) return false">Delete</a>
					   	|
					<a href = "${showLink}"
						onclick = "(!(confirm('Are you sure you want to delete this animal?'))) return false">Show</a>   
				</td>	
					
			</tr>
				
		</c:forEach>
						
	</table>
    	<input type="button" value="Add Animal"
					   onclick="window.location.href='showAnimalFormForAdd'; return false;"
					   class="button"/>
			
    
				    
</body>
</html>