<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>studentForm</title>
</head>
<body>
<%
	String context = request.getContextPath();	//get.ContextPath()->http://localhost:8080/ex1/
%>
	<form action="<%=context %>/studentView" method="post">
		�̸�: <input type="text" name="name"><br>
		����: <input type="text" name="age"><br>
		�г�: <input type="text" name="classNum"><br>
		��: <input type="text" name="gradeNum"><br>
		<input type="submit" value="����"><br>
	</form>
</body>
</html>