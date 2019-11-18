<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登录成功</h1>
	<hr>
	<table>
		<tr>
			<td>用户名：</td>
			<td>${userBean.username}</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td>${userBean.password}</td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td>${userBean.email}</td>
		</tr>
		
		<tr>
    		<td><font face="微软雅黑" size="3" color="black"><br/>
    		<a href="http://localhost:8080/chapter11/index.jsp">返回首页</a></font></td>
    	</tr>
	</table>
</body>
</html>