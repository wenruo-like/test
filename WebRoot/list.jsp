<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
  
  <body>
  <c:out value="用户列表"></c:out>
  <table>
  	<tr>
  		<td>用户名</td>
  		<td>密码</td>
  		<td>邮箱</td>
  	</tr>
  	<c:forEach items="${users}" var="user">
  		<tr>
  			<td>${user.username}</td>
  			<td>${user.password}</td>
  			<td>${user.email}</td>
  		</tr>
  	</c:forEach>
  	<tr>
    		<td><font face="微软雅黑" size="3" color="black"><br/>
    		<a href="http://localhost:8080/chapter11/index.jsp">返回首页</a></font></td>
    	</tr>
  </table>

  </body>
</html>
