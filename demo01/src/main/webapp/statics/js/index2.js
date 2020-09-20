$(document).ready(function(){
	
	$(".petName").blur(function(){
		var petName = $(".petName").val();
		
		var json = {
			method : "sel3",
			key_name : petName
		}
		$.post("PetServlet",json,function(result){
			if (result=="true") {
				$(".wen").text("名字已经存在，请重新输入");
				$(".wen").css("color","red");
			}else{
				$(".wen").text(" ");
			}
		});
	});
	
});

function add(){
	var petName = $(".petName").val();
	var petBreed = $(".petBreed").val();
	var sex = $("input[name='sex']:checked").val()
	var birthday = $(".birthday").val();
	var desc = $(".desc").val();
	if (petName=="") {
		alert("名字不能为空");
		return false;
	}
	
	if (petBreed=="请选择") {
		alert("请选择");
		return false;
	}
	
	var regb = /^\d\d\d\d+-+\d\d+-+\d\d$/;
	if (regb.test(birthday)==false) {
		alert("日期格式输入错误，请重新输入");
		return false;
	}
	
	var json = {
		method : "ins",
		key_name : petName,
		key_petBreed : petBreed,
		key_petSex : sex,
		key_birthday : birthday,
		key_desc : desc
	}
	
	$.post("PetServlet",json,function(result){
		if (result=="true") {
			alert("添加成功");
			location.href="index.jsp";
		}else{
			alert("添加失败");
		}
	});
	
	
}
