<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<form action="/insertPet" method="post">
	<h1>添加宠物信息</h1>
	<p>昵称：<input type="text" name="petName" id="name"/><span id="chongfu"></span></p>
	<p>品种：
		<select name="petBreed">
			<option value="0">--请选择--</option>
			<option value="狗">狗</option>
			<option value="鸟">鸟</option>
		</select>
	</p>
	<p>性别：<input type="radio" name="petSex" value="雄" checked="checked"/>雄<input type="radio" value="雌" name="petSex"/>雌</p>
	<p>出生日期：<input type="text" name="birthday"/></p>
	<p>宠物描述：<input type="text" name="description"/></p>
	<p><input type="submit" value="提交"/></p>
	</form>
	<script type="text/javascript">
		$("form").submit(function(){
			var name=$("[name='name']").val();
			if(name==""){
				alert("昵称不能为空");
				return false;
			}
			var birthday=$("[name='birthday']").val();
			var reg=/\d{4}-\d{2}-\d{2}/;
			if(birthday==""){
				alert("出生日期不能为空");
				return false;
			}
			if(reg.test($("[name='birthday']").val())==false){
				alert("日期格式不正确！");
				return false;
			}
			return true;
		})
	
		$("[name='petName']").blur(function(){
			var name=$(this).val();
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