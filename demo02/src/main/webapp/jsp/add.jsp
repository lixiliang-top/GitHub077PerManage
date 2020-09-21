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
<body>
<form action="/insert" method="post">
    <h1>添加宠物信息</h1>
    <p>昵称：<input type="text" name="name" id="name"/><span id="chongfu"></span></p>
    <p>品种：
        <select name="breed">
            <option value="0">--请选择--</option>
            <option value="狗">狗</option>
            <option value="鸟">鸟</option>
        </select>
    </p>
    <p>性别：<input type="radio" name="sex" value="雄" checked="checked"/>雄<input type="radio" value="雌" name="petSex"/>雌
    </p>
    <p>出生日期：<input type="text" name="birthday"/></p>
    <p>宠物描述：<input type="text" name="description"/></p>
    <p><input type="submit" value="提交"/></p>
</form>
<script type="text/javascript">
    $("form").submit(function () {
        var name = $("[name='name']").val();
        if (name == "") {
            alert("昵称不能为空");
            return false;
        }
        var birthday = $("[name='birthday']").val();
        var reg = /\d{4}-\d{2}-\d{2}/;
        if (birthday == "") {
            alert("出生日期不能为空");
            return false;
        }
        if (reg.test($("[name='birthday']").val()) == false) {
            alert("日期格式不正确！");
            return false;
        }
        return true;
    })

    $("[name='name']").blur(function () {
        var name = $(this).val();
        $.ajax({
            type: "GET",//请求类型
            url: "/WeiYi",//请求的url
            data: {name: $("#name").val()},//请求参数
            dataType: "json",//ajax接口（请求url）返回的数据类型
            success: function (result) {
                if (result.status == "true") {
                    $("#chongfu").html("昵称可用").css("color", "green");
                } else {
                    $("#chongfu").html("昵称已经存在，请重新输入！").css("color", "red");
                }
            }
        })
    })
</script>
</body>
</html>