<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
	  		<td>用户名</td>
	  		<td>密码</td>
	  		<td>邮箱</td>
	  		<td>删除</td>
	  	</tr>
	  	<c:forEach items="${users}" var="user">
	  		<tr>
	  			<td>${user.username}</td>
	  			<td>${user.password}</td>
	  			<td>${user.email}</td>
	  			<td><a href="http://localhost:8080/chapter11/DeleteServlet?username=${user.username}">删除</a></td>
	  		</tr>
	  	</c:forEach>
	  	<tr>
    		<td><font face="微软雅黑" size="3" color="black"><br/>
    		<a href="http://localhost:8080/chapter11/index.jsp">返回首页</a></font></td>
    	</tr>
	</table>
</body>
</html>