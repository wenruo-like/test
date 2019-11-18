<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/chapter11/servlet/RegisterServlet" method="post">
	<table>
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="username" value="${formBean.username}"/></td>
			<td><span>${errors.username}</span><span>${userex}</span></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="password1" value="${formBean.password1}" /></td>
			<td><span>${errors.password1}</span></td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td><input type="text" name="password2" value="${formBean.password2}" /></td>
			<td><span>${errors.password2}</span></td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td><input type="text" name="email" value="${formBean.email}" /></td>
			<td><span>${errors.email}</span></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="注册" /></td>
		</tr>
		<tr>
    		<td><font face="微软雅黑" size="3" color="black"><br/>
    		<a href="http://localhost:8080/chapter11/index.jsp">返回首页</a></font></td>
    	</tr>
	</table>
</form>
</body>
</html>