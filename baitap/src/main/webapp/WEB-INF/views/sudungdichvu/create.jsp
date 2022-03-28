<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create new lop hoc</title>
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
						<h2>Tạo lớp học</h2>
					</div>
					<div class="content-wrap">
						<form:form class="form-horizontal" action="/sudungdichvu/create" method="post" modelAttribute="sudungdichvu">
							<table border="1">
								<div>
									<label>Mã dịch vụ</label>
									<form:select path="dichvu">
										<form:options items="${dichvus}" itemLabel="MaDV"
											itemValue="MaDV" />
									</form:select>
								</div>
								<div>
									<label>Mã khách hàng</label>
									<form:select path="khachhang">
										<form:options items="${khachhangs}" itemLabel="MaKH"
											itemValue="MaKH" />
									</form:select>
								</div>
								<tr>
									<td>Ngày bắt đầu sử dụng</td>
									<td><form:input path="NgaySuDung" /></td>
								</tr>
								<tr>
									<td>Giờ bắt đầu sử dụng</td>
									<td><form:input path="GioSuDung" /></td>
								</tr>
								<tr>
									<td>Số lượng</td>
									<td><form:input path="SoLuong" /></td>
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