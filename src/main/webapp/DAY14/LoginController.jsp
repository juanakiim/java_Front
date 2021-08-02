<%@page import="Dao.memberdao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
request.setCharacterEncoding("EUC-KR");
String id = request.getParameter("id");
String password = request.getParameter("password");

memberdao memberdao = memberdao.getInstance();
int result = memberdao.login(id, password);




if (result == 1 ) {
	
	session.setAttribute("logid", id);
	response.sendRedirect("../DAY14/Board.jsp");
	
	
} else {
	
	response.sendRedirect("Login.jsp");

}





%>

<!--  itdanja@kakao.com 에 git주소보내기  -->



</body>
</html>