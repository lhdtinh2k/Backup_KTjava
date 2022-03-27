<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create new May</title>
	<link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
	<h1>Create new May</h1>
	<form:form action="/may/create" method="post" modelAttribute="may">		<!--	Maycontroller:	model.addAttribute("may", new May());  -->
		<table border="1">
			<tr>
				<td>Ma May</td>
				<td>
					<form:input path="MaMay"/>
				</td>
			</tr>
			<tr>
				<td>Vi Tri</td>
				<td>
					<form:input path="ViTri" />
				</td>
			</tr>
			<tr>
				<td>Trang Thai</td>
				<td>
					<form:input path="TrangThai" />
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