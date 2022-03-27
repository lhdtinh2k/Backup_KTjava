</head><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách máy</title>
</head>
<body>
	<h1>Danh sách máy</h1>
	<a href="/may/create">Tạo mới máy</a>
	<table border="1">
		<tr>
			<th>Mã máy</th>
			<th>vị trí</th>
			<th>Trạng thái</th>
			<th>Button</th>
		</tr>
		<c:forEach items="${listMays}" var="may">
			<tr>
				<td>${may.maMay }</td>			<!--Viết thường chữ cái đầu so với biến  -->
				<td>${may.getViTri() }</td>		<!--Gọi thẳng hàm get  -->
				<td>${may.getTrangThai() }</td>
				<td>
					<a href="/may/update?id=${may.getMaMay() }">Update</a>
					<a href="/may/delete?id=${may.getMaMay() }">Delete</a>
					<a href="/may/detail?id=${may.getMaMay() }">Detail</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

