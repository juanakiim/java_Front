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
    <td>���̵� :</td> 
    <td><input type="text" name="id" id="id"></td>
    </tr>
    <tr>
    <td>��й�ȣ :</td> 
    <td><input type="password" name="password" id="password"></td>
    </tr>
    <tr>
    <td><input type="submit" value="�α���"></td>
    <td><a href="Signup.jsp"><button>ȸ������</button></a></td>
    </tr>

<% 
            // ���̵�, ��й�ȣ�� Ʋ����� ȭ�鿡 �޽��� ǥ��
       
            String msg=request.getParameter("msg");
            
            if(msg!=null && msg.equals("0")) 
            {
                out.println("<br>");
                out.println("<font color='red' size='5'>��й�ȣ�� Ȯ���� �ּ���.</font>");
            }
            else if(msg!=null && msg.equals("-1"))
            {    
                out.println("<br>");
                out.println("<font color='red' size='5'>���̵� Ȯ���� �ּ���.</font>");
            }
        %>    



</body>
</html>