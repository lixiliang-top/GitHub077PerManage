<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/9/21
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
<body>
<p>
<form action="/" method="post">
    <span>品种</span>
    <select name="breed">
        <option value="1">--请选择--</option>
        <option value="狗">狗</option>
        <option value="鸟">鸟</option>
        <option value="猫">猫</option>
        <option value="老鼠">老鼠</option>
    </select>
    <input type="submit" value="查询"/>
    <a href="/toadd">新增宠物</a>
</form>
</p>
<table border="1px">
    <tr>
        <td>宠物昵称</td>
        <td>出生日期</td>
        <td>性别</td>
    </tr>
    <c:forEach items="${pets}" var="s">
        <tr>
            <td>${s.name}</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" type="both" value="${s.birthday}"/></td>
            <td>${s.sex}</td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
<script type="text/javascript">
    $("tr:even").css("background-color", "rgb(152,206,248)");
</script>
