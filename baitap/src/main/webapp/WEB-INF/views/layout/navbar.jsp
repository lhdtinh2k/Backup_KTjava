<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- Navbar  -->
<nav class="navbar-top navbar-default navbar-fixed-top nav-custom">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${contextPath}"><img src="${contextPath}/resources/img/fpt-logo.png" alt=""></a>
        </div>

        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav" style="margin-left: 270px">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                        aria-expanded="false">Máy
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${contextPath}/may/list">List máy</a></li>
                        <li><a href="${contextPath}/may/create">Create máy</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                        aria-expanded="false">Dịch vụ
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${contextPath}/dichvu/list">List dịch vụ</a></li>
                        <li><a href="${contextPath}/dichvu/create">Create dịch vụ</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                        aria-expanded="false">Khách hàng
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${contextPath}/khachhang/list">List Khách hàng</a></li>
                        <li><a href="${contextPath}/khachhang/create">Create Khách hàng</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                        aria-expanded="false">Sử dụng dịch vụ
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${contextPath}/sudungdichvu/list">List Sử dụng dịch vụ</a></li>
                        <li><a href="${contextPath}/sudungdichvu/create">Đăng ký Sử dụng dịch vụ</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                        aria-expanded="false">Sử dụng máy
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${contextPath}/sudungmay/list">List Sử dụng máy</a></li>
                        <li><a href="${contextPath}/sudungmay/create">Đăng ký sử dụng máy</a></li>
                    </ul>
                </li>
            </ul>
            <div class="col-sm-3 col-md-3">
                <form class="navbar-form" role="search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search" name="q" value="${q}" />
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
                        </div>
                    </div>
                </form>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <c:choose>
                    <c:when test="${not empty sessionScope.currentAccount}">
                        <c:choose>
                            <c:when test="${sessionScope.currentAccount.role.roleName == 'ROLE_ADMIN'}">
                                <li><a href="${contextPath}/admin"><span class="fa fa-user"></span> Welcome, ${sessionScope.currentAccount.username}</a></li>
                            </c:when>
                            <c:when test="${sessionScope.currentAccount.role.roleName == 'ROLE_EMPLOYEE'}">
                                <li><a href="${contextPath}/employee/booking-list"><span class="fa fa-user"></span> Welcome, ${sessionScope.currentAccount.username}</a></li>
                            </c:when>
                            <c:otherwise>
                                <li><a href="${contextPath}/member/account-info"><span class="fa fa-user"></span> Welcome, ${sessionScope.currentAccount.username}</a></li>
                            </c:otherwise>
                        </c:choose>
                        <li><a href="${contextPath}/logout"><span class="fa fa-power-off"></span> Logout</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="${contextPath}/login">Login</a></li>
                        <li><a href="${contextPath}/register">Register</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </div>
</nav>