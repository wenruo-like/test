<%@page import="cn.edu.sjzc.domain.UserBean"%>
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
<%
	UserBean ub = (UserBean) request.getAttribute("user");
 %>
<form action="QueryServlet" method="post">
	<table>
		<tr>
			<td>用户名</td>
			<td><input type="text" name="username" /></td>
			<td><input type="submit" value="查询" /></td>
		</tr>
  	<tr>
  		<td>用户名</td>
  		<td>密码</td>
  		<td>邮箱</td>
  	</tr>
	  		<tr>
	  			<td><%= ub!=null?ub.getUsername():"" %></td>
	  			<td><%= ub!=null?ub.getPassword():"" %></td>
	  			<td><%= ub!=null?ub.getEmail():"" %></td>
	  		</tr>
		<tr>
    		<td><font face="微软雅黑" size="3" color="black"><br/>
    		<a href="http://localhost:8080/chapter11/index.jsp">返回首页</a></font></td>
    	</tr>
	</table>
</form>
</body>
</html>