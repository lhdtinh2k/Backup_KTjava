<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create new student</title>
	<link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
	<h1>Create new Student</h1>
	<form:form action="/student/create" method="post" modelAttribute="student">
		<table border="1">
			<tr>
				<td>ID</td>
				<td>
					<form:input path="id"/>
					<form:errors path="id" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					<form:input path="name" />
					<form:errors path="name" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>
					<form:input path="age" />
					<form:errors path="age" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Birthday</td>
				<td>
					<form:input path="birthday" />
					<form:errors path="birthday" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><form:button>Register</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>