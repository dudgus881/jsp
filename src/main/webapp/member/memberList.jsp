<%@page import="kr.or.ddit.member.service.MemberService"%>
<%@page import="kr.or.ddit.member.service.MemberServiceI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp</title>

<%@ include file="/layout/commonLib.jsp" %>
</head>

<body>

	
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">JSP/SPRING</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Dashboard</a></li>
				<li><a href="#">Settings</a></li>
				<li><a href="#">Profile</a></li>
				<li><a href="#">Help</a></li>
			</ul>
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search...">
			</form>
		</div>
	</div>
</nav><div class="container-fluid">
		<div class="row">
			
<div class="col-sm-3 col-md-2 sidebar">
	<ul class="nav nav-sidebar">
		<li class="active"><a href="#">Main <span class="sr-only">(current)</span></a></li>
		<li class="active"><a href="#">사용자</a></li>
		<li class="active"><a href="#">jobs</a></li>
	</ul>
</div><div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				

<div class="row">
	<div class="col-sm-8 blog-main">
		<h2 class="sub-header">사용자</h2>
		<div class="table-responsive">
			
		<table class="table table-striped">
		<tr>
			<th>사용자 아이디</th>
			<th>사용자 이름</th>
			<th>사용자 별명</th>
			<th>등록일시</th>
		</tr>
		<c:forEach items="${memberList }" var="member">
			<tr>
				<td>${member.userid }</td>
				<td>${member.usernm }</td>
				<td>${member.alias }</td>
				
				<!--  format : yyyy-MM-dd -->
				<td><fmt:formatDate ></fmt:formatDate></td>
				<td>${member.reg_dt }</td>
			</tr>
		</c:forEach>
		</table>
		</div>

		<a class="btn btn-default pull-right">사용자 등록</a>
		page : ${page }
		<div class="text-center">
			<ul class="pagination">
				<c:forEach var="i" begin="1" end="${pages }">
					<c:choose>
						<c:when test="${i == page}">
							<li class="active"><span>${i }</span></li>	
						</c:when>
						<c:otherwise>
							<li><a href="${pageContext.request.contextPath }/memberListServlet?page=${i}">${i}</a></li>		
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</ul>
		</div>
	</div>
</div>
	</div>
		</div>
	</div>
</body>
</html>