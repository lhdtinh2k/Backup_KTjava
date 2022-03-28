<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tạo mới máy</title>
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
						<h1>Tạo mới máy</h1>
					</div>
					<div class="content-wrap">
						<form:form action="/may/create" method="post" modelAttribute="may">
							<!--	Maycontroller:	model.addAttribute("may", new May());  -->
							<table border="1">
								<tr>
									<td>Vi Tri</td>
									<td><form:input path="ViTri" /></td>
								</tr>
								<tr>
									<td>Trang Thai</td>
									<td><form:input path="TrangThai" /></td>
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