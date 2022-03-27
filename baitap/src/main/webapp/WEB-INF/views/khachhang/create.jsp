<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Tạo mới khách hàng</title>
	<link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
	<h1>Tạo mới khách hàng</h1>
	<form:form action="/khachhang/create" method="post" modelAttribute="khachhang">
		<table border="1">
			<tr>
				<td>Ma khách hàng</td>
				<td>
					<form:input path="MaKH"/>

				</td>
			</tr>
			<tr>
				<td>Tên khách hàng</td>
				<td>
					<form:input path="TenKH" />

				</td>
			</tr>
			<tr>
				<td>Địa chỉ</td>
				<td>
					<form:input path="DiaChi" />

				</td>
			</tr>
			<tr>
				<td>Số điện thoại</td>
				<td>
					<form:input path="SoDienThoai" />

				</td>
			</tr>
			<tr>
				<td>Địa chỉ Email</td>
				<td>
					<form:input path="DiaChiEmail" />

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