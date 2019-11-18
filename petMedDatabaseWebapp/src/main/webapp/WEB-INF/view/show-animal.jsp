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
		
		<div id = "appointmentsArea">
		<c:forEach var="tempAnimal" items="${animals}">								
		<table>
			<tr>
				<td> ${tempAnimal.name} </td>
				<td> ${tempAnimal.age} </td>
				<td> ${tempAnimal.genus} </td>
				<td> ${tempAnimal.vet.name}</td>
						
				<td>  
				</td>
					
			</tr>
			
			
				
		</c:forEach>
		
		</table>
		</div>
	
	
	</div>



</body>
</html>