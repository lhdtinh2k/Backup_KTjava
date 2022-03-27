<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách dịch vụ</title>
</head>
<body>
	<h1>Danh sách dịch vụ</h1>
	<a href="/dichvu/create">Tạo mới dịch vụ</a>
	<table border="1">
		<tr>
			<th>Mã dịch vụ</th>
			<th>Tên dịch vụ</th>
			<th>Đơn vị tính</th>
			<th>Giá</th>
			<th>Button</th>
		</tr>
		<c:forEach items="${listDichVus}" var="dichvu">
			<tr>
				<td>${dichvu.maDV }</td>
				<td>${dichvu.tenDV }</td>
				<td>${dichvu.donViTinh }</td>
				<td>${dichvu.donGia }</td>
				<td>
					<a href="/dichvu/update?id=${dichvu.maDV }">Update</a>
					<a href="/dichvu/delete?id=${dichvu.maDV }">Delete</a>
					<a href="/dichvu/detail?id=${dichvu.maDV }">Detail</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>