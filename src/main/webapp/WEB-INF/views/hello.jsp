<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>hello</title>
</head>
<body>
	인사말 : <%=request.getAttribute("greeting") %>	<%--greeting이라고 하는 변수의 값을 받아 쓰겠다--%>
</body>
</html>