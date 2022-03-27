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
	<form:form action="/dichvu/update" method="post" modelAttribute="updateDichVu">
		<table border="1">
			<tr>
				<td>Mã dịch vụ</td>
				<td>${updateDichVu.maDV }</td>
			</tr>
			<tr>
				<td>Tên Dịch vụ</td>
				<td>
					<form:input path="TenDV" />
				</td>
			</tr>
			<tr>
				<td>Đơn vị tính</td>
				<td><form:input path="DonViTinh" /></td>
			</tr>
			<tr>
				<td>Giá</td>
				<td>
					<form:input path="DonGia" />

				</td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><form:button>Update</form:button></td>
			</tr>
		</table>
		<form:hidden path="MaDV"/>
	</form:form>
</body>
</html>