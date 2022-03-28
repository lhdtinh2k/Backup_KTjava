<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List máy</title>
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
							<h2>List máy</h2>
						</div>
						<div class="body table-responsive">
							<a href="/may/create">Tạo mới máy</a>
							<table class="table table-striped" id="dataTable-listMember">
								<thead>
									<tr>
										<th>Mã máy</th>
										<th>vị trí</th>
										<th>Trạng thái</th>
										<th>Button</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listMays}" var="may">
										<tr>
											<td>${may.maMay }</td>
											<!--Viết thường chữ cái đầu so với biến  -->
											<td>${may.getViTri() }</td>
											<!--Gọi thẳng hàm get  -->
											<td>${may.getTrangThai() }</td>
											<td><a href="/may/update?id=${may.getMaMay() }">Update</a>
												<a href="/may/delete?id=${may.getMaMay() }">Delete</a> <a
												href="/may/detail?id=${may.getMaMay() }">Detail</a></td>
										</tr>
									</c:forEach>
								</tbody>
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