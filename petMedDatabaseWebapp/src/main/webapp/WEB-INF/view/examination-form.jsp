<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
h2{
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: lightblue;
  color: black;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
table{
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
}
</style>
</head>

<body>
<div id = "wrapper">
	<div id = "header">
		<h2>Make an Examination Appointment</h2>
	</div>
</div>


<div id ="container">
	
	<form:form action = "saveExamination" modelAttribute="examination" method = "POST">
	<form:hidden path="examinationId"/> 
	
	<table>
		<tbody>
		
		<form>
 	 	Appointment Date: <input type="date" path="appointmentDate">
		</form>
		
			<tr>
				<td><label>Evcil Hayvaniniz:</label> </td>
				<td>
					<form:select path="animal">
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
