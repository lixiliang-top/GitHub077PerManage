$(document).ready(function () {
    selectBcc();
    $(".chaxun").click(function () {
        selectBcc();
    });
});

var date;
function selectBcc(){
	$(".sss").remove();
	var petBreed = $(".qing").val();
	var json = {
        petbreed : petBreed
	}
    $.post("/doIndex",json,function(result){
        console.log(result.data)
        $.each(result.data,function(i,v){
            date = v.birthday.substring(0,10);
            var $tr = $("<tr class='sss'><td>"+v.petname+"</td><td>"+date+"</td><td>"+v.petsex+"</td></tr>");
            console.log($tr)
            $(".table").append($tr);
        });
    },"json");
}