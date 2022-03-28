<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update dịch vụ</title>
<link rel="stylesheet" href="/resources/css/index.css">
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
</head>
<body>
	<jsp:include page="/WEB-INF/views/layout/page-loader.jsp" />
	<jsp:include page="/WEB-INF/views/layout/navbar.jsp" />
	<jsp:include page="/WEB-INF/views/layout/sidebar.jsp" />

	<div class="page-content container">
		<div class="row">
			<div class="col-md-5 col-md-offset-4 col-md-offset-4-custom">
				<div class="login-wrapper">
					<div class="box">
						<h2>Update dịch vụ</h2>
					</div>
					<div class="content-wrap">
						<form:form action="/dichvu/update" method="post"
							modelAttribute="updateDichVu">
							<table border="1">
								<tr>
									<td>Mã dịch vụ</td>
									<td>${updateDichVu.maDV }</td>
								</tr>
								<tr>
									<td>Tên Dịch vụ</td>
									<td><form:input path="TenDV" /></td>
								</tr>
								<tr>
									<td>Đơn vị tính</td>
									<td><form:input path="DonViTinh" /></td>
								</tr>
								<tr>
									<td>Giá</td>
									<td><form:input path="DonGia" /></td>
								</tr>
								<tr>
									<td><input type="reset" value="Reset"></td>
									<td><form:button>Update</form:button></td>
								</tr>
							</table>
							<form:hidden path="MaDV" />
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="/WEB-INF/views/layout/script.jsp" />
	<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
</body>
</html>