<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h4> USER LOGIN </h4>

<form method="post" action="LoginController.jsp"></form>

<table border="0">
    <tr>
    <td>아이디 :</td> 
    <td><input type="text" name="id" id="id"></td>
    </tr>
    <tr>
    <td>비밀번호 :</td> 
    <td><input type="password" name="password" id="password"></td>
    </tr>
    <tr>
    <td><input type="submit" value="로그인"></td>
    <td><a href="Signup.jsp"><button>회원가입</button></a></td>
    </tr>

<% 
            // 아이디, 비밀번호가 틀릴경우 화면에 메시지 표시
       
            String msg=request.getParameter("msg");
            
            if(msg!=null && msg.equals("0")) 
            {
                out.println("<br>");
                out.println("<font color='red' size='5'>비밀번호를 확인해 주세요.</font>");
            }
            else if(msg!=null && msg.equals("-1"))
            {    
                out.println("<br>");
                out.println("<font color='red' size='5'>아이디를 확인해 주세요.</font>");
            }
        %>    



</body>
</html>