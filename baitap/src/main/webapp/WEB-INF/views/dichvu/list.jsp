<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List dịch vụ</title>
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
							<h2>List dịch vụ</h2>
						</div>
						<div class="body table-responsive">
							<a href="/dichvu/create">Tạo mới dịch vụ</a>
							<table class="table table-striped" id="dataTable-listMember">
								<thead>
									<tr>
										<th>Mã dịch vụ</th>
										<th>Tên dịch vụ</th>
										<th>Đơn vị tính</th>
										<th>Giá</th>
										<th>Button</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listDichVus}" var="dichvu">
										<tr>
											<td>${dichvu.maDV }</td>
											<td>${dichvu.tenDV }</td>
											<td>${dichvu.donViTinh }</td>
											<td>${dichvu.donGia }</td>
											<td><a href="/dichvu/update?id=${dichvu.maDV }">Update</a>
												<a href="/dichvu/delete?id=${dichvu.maDV }">Delete</a> <a
												href="/dichvu/detail?id=${dichvu.maDV }">Detail</a></td>
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