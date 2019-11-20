<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Arrangement Form</title>


</head>
<body>
<div id = "wrapper">
	<div id = "header">
		<h2>HELLO WORLD!</h2>
	</div>
</div>


<div id ="container">
	<h3>Make an Examination Appointment</h3>
	<form:form action = "saveExamination" modelAttribute="examination" method = "POST">
	
	
	<table>
		<tbody>
		
		<form>
 	 	Appointment Date: <input type="date" path="appointmentDate">
		</form>
		
			<tr>
				<td><label>Evcil Hayvaniniz:</label> </td>
				<td>
					<form:select path="examination.appointment.animal">
						<form:options items="${animals}"/>
					</form:select>
				</td>
			</tr>

			<tr>
				<td><label>Hayvanin veterineri:</label> </td>
				<td>
					<form:select path="vet">
						<form:options items="${vets}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>
		</tbody> 
	
	</table>
	
	
	
	
	</form:form>
	
</div>


</body>
</html>