<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tạo mới Khách hàng</title>
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
						<h1>Tạo mới Khách hàng</h1>
					</div>
					<div class="content-wrap">
						<form:form action="/khachhang/create" method="post"
							modelAttribute="khachhang">
							<table class="table table-striped">
								<tr>
									<td>Tên khách hàng</td>
									<td><form:input path="TenKH" /></td>
									<form:errors path="TenKH" cssClass="error"></form:errors>
								</tr>
								<tr>
									<td>Địa chỉ</td>
									<td><form:input path="DiaChi" /></td>
									<form:errors path="DiaChi" cssClass="error"></form:errors>
								</tr>
								<tr>
									<td>Số điện thoại</td>
									<td><form:input path="SoDienThoai" /></td>
									<form:errors path="SoDienThoai" cssClass="error"></form:errors>
								</tr>
								<tr>
									<td>Địa chỉ Email</td>
									<td><form:input path="DiaChiEmail" /></td>
									<form:errors path="DiaChiEmail" cssClass="error"></form:errors>
								</tr>
								<tr>
									<td><input type="reset" value="Reset"></td>
									<td><form:button>Register</form:button></td>
								</tr>
							</table>
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