<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer List Page</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Management Application</h2>
		</div>
	</div>

	<div id="container">
		<input type="button" value="Add customer"
			onclick="window.location.href='showFormForAdd'; return false;" />

		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>

			<c:forEach var="customer" items="${customers}">
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${customer.id}" />
				</c:url>

				<c:url var="deleteLink" value="/customer/deleteCustomer">
					<c:param name="customerId" value="${customer.id}" />
				</c:url>

				<tr>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					<td>${customer.email}</td>
					<td><a href="${updateLink}">Update</a> | <a href="${deleteLink}"
						onclick="if (!(confirm('Are you sure want to delete this customer?'))) return false">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>