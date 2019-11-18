<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>

  <body>
  <fieldset>
  <legend>
  <font face="微软雅黑" size="7" color="black"><br/>
  Welcome</font>
  </legend>
    <table cellpadding="2" align="left">
    	<tr>
    		<td><a href="http://localhost:8080/chapter11/register.jsp">注册</a></td>
    	</tr>
    	<tr>
    		<td><a href="http://localhost:8080/chapter11/login.jsp">登录</a></td>
    	</tr>
    	<tr>
    		<td><a href="http://localhost:8080/chapter11/ListServlet">用户列表</a></td>
    	</tr>
    	<tr>
    		<td><a href="#">增加</a></td>
    	</tr>
    	<tr>
    		<td><a href="http://localhost:8080/chapter11/ToDeleteList">删除</a></td>
    	</tr>
    	<tr>
    		<td><a href="http://localhost:8080/chapter11/ToModifyList">修改</a></td>
    	</tr>
    	<tr>
    		<td><a href="http://localhost:8080/chapter11/QueryServlet">查询</a></td>
    	</tr>
    </table>
    </fieldset>
  </body>
</html>
