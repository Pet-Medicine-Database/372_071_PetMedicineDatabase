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
	<h2> Vaccine List Page </h2>
	<!-- List attributes of vaccines -->
	<!-- Note to myself: Add Search Button -->
	<!-- vaccineList has acquired as model attribute. -->
	
	
	<table>
		<tr>
			<th>Asinin ismi</th>
			<th>Asinin son kullanma tarihi</th>
			<th>Asinin stok durumu</th>
			<th>Asinin seri numarasi</th>
		</tr>
		<c:forEach var="tempVaccine" items="${vaccineList}">
			<c:url var="updateLink" value="/vaccine/showVaccineFormForUpdate">
				<c:param name="serialNumber" value="${tempVaccine.serialNumber}" />
			</c:url>
			
			<tr>
				<td>${tempVaccine.name}</td>
				<td>${tempVaccine.expirationDate}</td>
				<td>${tempVaccine.stock}</td>
				<td>${tempVaccine.serialNumber}</td>
				<td><a href="${updateLink}"><img src='<c:url value = "path"/>'></a></td>
			</tr>	
		</c:forEach>	
	</table>


</body>
</html>