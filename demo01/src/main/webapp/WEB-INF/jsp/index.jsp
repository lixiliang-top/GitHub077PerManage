<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/9/20
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    品种：<select class="qing"><option value="请选择">请选择</option>
    <option>狗</option>
    <option>猫</option>
    <option>鸟</option>
    <option>老鼠</option>
</select>
    <button class="chaxun">查询</button>
    <a href="/toIndex2">新增宠物</a>
</div>
<table width="700" height="30" border="1" align="center" class="table">
    <tr align="center" style="background: #9C9A9C">
        <td>宠物昵称</td>
        <td>出生日期</td>
        <td>性别</td>
    </tr>
</table>
</body>
<script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/statics/js/index.js"></script>
</html>
