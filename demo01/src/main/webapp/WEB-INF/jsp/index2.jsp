<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/9/20
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doIndex2" method="post">
    <table width="450" height="30" align="center">
        <tr>
            <th colspan="2">
                <h2>添加宠物信息</h2>
            </th>
        </tr>
        <tr>
            <td>宠物昵称:<b style="color: red;" class="cuo"></b></td>
            <td><input type="text" name="petname" class="petName"><span class="wen"></span></td>
        </tr>
        <tr>
            <td>品种:</td>
            <td><select class="petBreed" name="petbreed"><option>请选择</option>
                <option>狗</option>
                <option>猫</option>
                <option>鸟</option>
                <option>老鼠</option>
            </select></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="radio" checked="checked" name="petsex" value="雄">雄<input
                    type="radio" name="petsex"  value="雌">雌</td>
        </tr>
        <tr>
            <td>出生日期:</td>
            <td><input type="text" name="birthday" class="birthday"></td>
        </tr>
        <tr>
            <td>宠物描述:</td>
            <td><textarea class="desc" name="description" rows="4" cols="18"></textarea></td>
        </tr>
        <tr style="background-color: white;" align="center">
            <td colspan="2"><input type="submit" value="添加"/>
        </tr>
    </table>
</form>
</body>
<%--<script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>--%>
<%--<script type="text/javascript" src="/statics/js/index2.js"></script>--%>
</html>
