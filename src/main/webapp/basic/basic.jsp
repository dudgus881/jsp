<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>basic.jsp</title>
</head>
<body>
	<% //스크립틀릿 : 자바 로직을 작성하는 공간
		//특정 메서드 안에서 구현하는 자바로직 : 지역변수
		Date date = new Date();
	%>
	
	<!-- expression : 화면에 출력을 해준다.
			writer.print()와 동일
	 -->
	현재시간 : <%=date %>
	
</body>
</html>