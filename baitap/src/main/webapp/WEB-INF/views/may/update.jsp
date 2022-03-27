<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Update new student</title>
	<link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
	<h1>Update new Student</h1>
	<form:form action="/may/update" method="post" modelAttribute="updateMay">
		<table border="1">
			<tr>
				<td>Ma May</td>
				<td>${updateMay.maMay }</td>
			</tr>
			<tr>
				<td>Vi Tri</td>
				<td>
					<form:input path="ViTri" />
				</td>
			</tr>
			<tr>
				<td>Trang Thai</td>
				<td><form:input path="TrangThai" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><form:button>Update</form:button></td>
			</tr>
		</table>
		<form:hidden path="MaMay"/>
	</form:form>
</body>
</html>