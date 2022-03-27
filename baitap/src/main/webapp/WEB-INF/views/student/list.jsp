<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List student</title>
</head>
<body>
	<h1>List student</h1>
	<a href="/student/create">Create new student</a>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Address</th>
			<th>Button</th>
		</tr>
		<c:forEach items="${listStudents}" var="student">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.age }</td>
				<td>${student.address }</td>
				<td>
					<a href="/student/update?id=${student.id }">Update</a>
					<a href="/student/delete?id=${student.id }">Delete</a>
					<a href="/student/detail?id=${student.id }">Detail</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>