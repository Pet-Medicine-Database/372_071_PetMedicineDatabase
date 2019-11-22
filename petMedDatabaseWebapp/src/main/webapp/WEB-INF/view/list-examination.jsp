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
<h2> Examination List Page </h2>


<table>
	<tr>
 	<th>Muayene Tarihi</th>
 	<th>Evcil Hayvan</th>
 	<th>Sorumlu Veteriner</th>
 	<th>Evcil Hayvanin Sahibi</th>
	</tr>
	
	<c:forEach var="tempExamination" items="${examinations}">
    
    <!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/boarding/showBoardingFormForUpdate">
				<c:param name="examinationId" value="${tempExamination.id}" />
			</c:url>					

			<!-- construct an "delete" link with customer id -->
			<c:url var="deleteLink" value="/animal/delete">
				<c:param name="examinationId" value="${tempExamination.id}" />
			</c:url>	
	<tr>
				<td> ${tempExamination.appointmentDate} </td>
				<td> ${tempExamination.animal.name} </td>
				<td> ${tempExamination.vet.name} </td>
				<td> ${tempExamination.owner.name}</td>
	
    <td>
					<!-- display the update link -->
					<a href="${updateLink}">Update</a>
							|
					<a href="${deleteLink}"
					   onclick="if (!(confirm('Are you sure you want to delete this examination?'))) return false">Delete</a>
				</td>	
    
    </tr>
    
	</c:forEach>
</table>
    	<input type="button" value="Add Examination" 
			onclick = "window.location.href='showExaminationFormForAdd'; return false;"
			class = "button">

</body>
</html>
