<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List sử dụng dịch vụ</title>
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
							<h2>List sử dụng dịch vụ</h2>
						</div>
						<div class="body table-responsive">
							<a href="/sudungdichvu/create">Tạo mới sử dụng dịch vụ</a>
							<table class="table table-striped" id="dataTable-listMember">
								<thead>
									<tr>
										<th>Mã máy</th>
										<th>Mã khách hàng</th>
										<th>Ngày bắt đầu sử dụng</th>
										<th>Giờ bắt đầu sử dụng</th>
										<th>Thời gian</th>
										<th>Button</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listSuDungMays}" var="sdmay">
										<tr>
											<td>${sdmay.maMay.getMaMay() }</td>
											<td>${sdmay.maKH.getMaKH() }</td>
											<td>${sdmay.ngayBatDauSuDung }</td>
											<td>${sdmay.gioBatDauSuDung }</td>
											<td>${sdmay.thoiGianSuDung }</td>
											<td><a href="/sudungmay/update?id=${sdmay.maMay.getMaMay() }">Update</a>
												<a href="/sudungmay/delete?id=${sdmay.maMay.getMaMay() }">Delete</a> <a
												href="/sudungmay/detail?id=${sdmay.maMay.getMaMay() }">Detail</a></td>
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