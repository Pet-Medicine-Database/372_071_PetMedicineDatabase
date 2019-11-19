<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vaccine list</title>
</head>
<body>
	<h1> Vaccine list </h1>
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