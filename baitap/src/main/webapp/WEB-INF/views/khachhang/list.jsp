<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List khách hàng</title>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
</head>
<body>
	<jsp:include page="/WEB-INF/views/layout/page-loader.jsp" />
	<jsp:include page="/WEB-INF/views/layout/navbar.jsp" />
	<jsp:include page="/WEB-INF/views/layout/sidebar.jsp" />

	<section class="content">
		<div class="container-fluid">
			<!-- Striped Rows -->
			<div class="row clearfix">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="card">
						<div class="header">
							<h2>List khách hàng</h2>
						</div>
						<div class="body table-responsive">
							<a href="/khachhang/create">Tạo mới khách hàng</a>
							<table class="table table-striped" id="dataTable-listMember">
								<thead>
									<tr>
										<th>Mã khách hàng</th>
										<th>Tên dịch vụ</th>
										<th>Địa chỉ</th>
										<th>Số điện thoại</th>
										<th>Địa chỉ Email</th>
										<th>Button</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listKhachHangs}" var="khachhang">
										<tr>
											<td>${khachhang.maKH }</td>
											<td>${khachhang.tenKH }</td>
											<td>${khachhang.diaChi }</td>
											<td>${khachhang.soDienThoai }</td>
											<td>${khachhang.diaChiEmail }</td>
											<td><a href="/khachhang/update?id=${khachhang.maKH }">Update</a>
												<a href="/khachhang/delete?id=${khachhang.maKH }">Delete</a>
												<a href="/khachhang/detail?id=${khachhang.maKH }">Detail</a>
											</td>
										</tr>
								</tbody>
								</c:forEach>
							</table>
						</div>
					</div>
				</div>
			</div>
			<!-- #END# Striped Rows -->
		</div>
	</section>
	<jsp:include page="/WEB-INF/views/layout/script.jsp" />
	<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
</body>
</html>