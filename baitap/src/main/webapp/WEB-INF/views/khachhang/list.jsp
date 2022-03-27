<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách khách hàng</title>
</head>
<body>
	<h1>Danh sách khách hàng</h1>
	<a href="/khachhang/create">Tạo mới khách hàng</a>
	<table border="1">
		<tr>
			<th>Mã dịch vụ</th>
			<th>Tên dịch vụ</th>
			<th>Đơn vị tính</th>
			<th>Giá</th>
			<th>Button</th>
		</tr>
		<c:forEach items="${listKhachHangs}" var="khachhang">
			<tr>
				<td>${khachhang.maKH }</td>
				<td>${khachhang.tenKH }</td>
				<td>${khachhang.diaChi }</td>
				<td>${khachhang.soDienThoai }</td>
				<td>${khachhang.diaChiEmail }</td>
				<td>
					<a href="/khachhang/update?id=${khachhang.maKH }">Update</a>
					<a href="/khachhang/delete?id=${khachhang.maKH }">Delete</a>
					<a href="/khachhang/detail?id=${khachhang.maKH }">Detail</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>