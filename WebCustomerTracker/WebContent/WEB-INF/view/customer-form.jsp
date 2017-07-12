<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer Form</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Management Application</h2>
		</div>
	</div>

	<div id="container">
		<table>

			<form:form action="addCustomer" modelAttribute="customer"
				method="POST">
				<form:hidden path="id" />
				<tr>
					<td><label>First Name:</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save/Update" /></td>
				</tr>
			</form:form>
		</table>

		<a href="${pageContext.request.contextPath}/customer/list">Back to
			the List</a>
	</div>
</body>
</html>