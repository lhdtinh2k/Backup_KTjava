<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Tạo mới Dịch vụ</title>
	<link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
	<h1>Tạo mới Dịch vụ</h1>
	<form:form action="/dichvu/create" method="post" modelAttribute="dichvu">
		<table border="1">
			<tr>
				<td>Tên Dịch vụ</td>
				<td>
					<form:input path="TenDV" />

				</td>
			</tr>
			<tr>
				<td>Đơn vị tính</td>
				<td>
					<form:input path="DonViTinh" />

				</td>
			</tr>
			<tr>
				<td>Giá</td>
				<td>
					<form:input path="DonGia" />

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