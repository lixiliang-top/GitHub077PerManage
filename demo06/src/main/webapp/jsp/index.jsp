<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/doIndex" method="post">
	<div style="" align="center">品种
	<select name="breed">
		<option value="">--请选择--</option>
		<option value="狗">狗</option>
		<option value="鸟">鸟</option>
	</select>
	<input type="submit" value="查询"/>
	<a href="/addPet">新增宠物</a>
	</div>
	</form>
	<br />
	<table border="1px" align="center">
		<tr align="center">
			<td>宠物昵称</td>
			<td>出生日期</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${ petList }" var="list">
		<tr align="center">
			<td>${ list.petName }</td>
			<td><fmt:formatDate value="${ list.birthday }" pattern="yyyy-MM-dd"></fmt:formatDate></td>
			<td>${ list.petSex }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>