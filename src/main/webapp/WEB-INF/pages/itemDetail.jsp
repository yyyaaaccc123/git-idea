<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<form>
		<table width="100%" border=1>
			<tr>
				<td>用户id</td>
				<td> ${items.uid } </td>
			</tr>
			<tr>
				<td>用户姓名</td>
				<td> ${items.userName} </td>
			</tr>
			<tr>
				<td>用户年龄</td>
				<td> ${items.age}</td>
			</tr>
			<tr>
				<td>用户性别</td>
				<td>${items.sex} </td>
			</tr>
		</table>
	</form>
</body>
</html>