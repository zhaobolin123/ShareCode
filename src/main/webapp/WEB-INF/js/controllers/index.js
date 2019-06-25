window.onload = function() {
		    //配置
		    var config = {
		        vx: 4,	//小球x轴速度,正为右，负为左
		        vy: 4,	//小球y轴速度
		        height: 2,	//小球高宽，其实为正方形，所以不宜太大
		        width: 2,
		        count: 200,		//点个数
		        color: "208, 208, 208", 	//点颜色
		        stroke: "208, 208, 208", 		//线条颜色
		        dist: 6000, 	//点吸附距离
		        e_dist: 20000, 	//鼠标吸附加速距离
		        max_conn: 10 	//点到点最大连接数
		    }

		    //调用
		    CanvasParticle(config);
	}

$("#checkplan").click(function(){
	var plan = $("input[type='radio']:checked").val();
	$("#plancheck").html(plan);
});

var sport = "";

$("#checkplan2").click(function(){
	var flover = $("input[name='flover']:checked").val();
	var drink = $("input[name='drink']:checked").val();
	var allergy = $("input[name='allergy']:checked").val();
	$("#plancheck2").html(flover);
	$("#plancheck2").append('<h5>'+drink+'</h5>');
	if(allergy!=undefined)
	$("#plancheck2").append('<h5>'+allergy+'</h5>');
	if(sport!=undefined)
	$("#plancheck2").append('<h5>'+sport+'</h5>');
});

$("#checkplan3").click(function(){
	var eat = $("input[name='eat']:checked").val();
	var type = $("input[name='type']:checked").val();
	$("#plancheck3").html(eat);
	$("#plancheck3").append('<h5>'+type+'</h5>');
});

$("#star1").mouseover(function(){
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$(".star span").html("基本不运动");
});
$("#star1").mouseleave(function(){
	$("#star1").removeClass("fa fa-star");
	$("#star1").addClass("fa fa-star-o");
	$("#star1").css("color","black");
	$(".star span").html("");
});
$("#star2").mouseover(function(){
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$("#star2").removeClass("fa fa-star-o");
	$("#star2").addClass("fa fa-star");
	$("#star2").css("color","gold");
	$(".star span").html("运动较少");
});
$("#star2").mouseleave(function(){
	$("#star1").removeClass("fa fa-star");
	$("#star1").addClass("fa fa-star-o");
	$("#star1").css("color","black");
	$("#star2").removeClass("fa fa-star");
	$("#star2").addClass("fa fa-star-o");
	$("#star2").css("color","black");
	$(".star span").html("");
});
$("#star3").mouseover(function(){
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$("#star2").removeClass("fa fa-star-o");
	$("#star2").addClass("fa fa-star");
	$("#star2").css("color","gold");
	$("#star3").removeClass("fa fa-star-o");
	$("#star3").addClass("fa fa-star");
	$("#star3").css("color","gold");
	$(".star span").html("运动一般");
});
$("#star3").mouseleave(function(){
	$("#star1").removeClass("fa fa-star");
	$("#star1").addClass("fa fa-star-o");
	$("#star1").css("color","black");
	$("#star2").removeClass("fa fa-star");
	$("#star2").addClass("fa fa-star-o");
	$("#star2").css("color","black");
	$("#star3").removeClass("fa fa-star");
	$("#star3").addClass("fa fa-star-o");
	$("#star3").css("color","black");
	$(".star span").html("");
});
$("#star4").mouseover(function(){
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$("#star2").removeClass("fa fa-star-o");
	$("#star2").addClass("fa fa-star");
	$("#star2").css("color","gold");
	$("#star3").removeClass("fa fa-star-o");
	$("#star3").addClass("fa fa-star");
	$("#star3").css("color","gold");
	$("#star4").removeClass("fa fa-star-o");
	$("#star4").addClass("fa fa-star");
	$("#star4").css("color","gold");
	$(".star span").html("经常运动");
});
$("#star4").mouseleave(function(){
	$("#star1").removeClass("fa fa-star");
	$("#star1").addClass("fa fa-star-o");
	$("#star1").css("color","black");
	$("#star2").removeClass("fa fa-star");
	$("#star2").addClass("fa fa-star-o");
	$("#star2").css("color","black");
	$("#star3").removeClass("fa fa-star");
	$("#star3").addClass("fa fa-star-o");
	$("#star3").css("color","black");
	$("#star4").removeClass("fa fa-star");
	$("#star4").addClass("fa fa-star-o");
	$("#star4").css("color","black");
	$(".star span").html("");
});
$("#star5").mouseover(function(){
	$(".star i").removeClass("fa fa-star-o");
	$(".star i").addClass("fa fa-star");
	$(".star i").css("color","gold");
	$(".star span").html("运动狂人");
	
});
$("#star5").mouseleave(function(){
	$(".star i").removeClass("fa fa-star");
	$(".star i").addClass("fa fa-star-o");
	$(".star i").css("color","black");
	$(".star span").html("");
});

$("#star1").click(function(){
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$("#star2").removeClass("fa fa-star");
	$("#star2").addClass("fa fa-star-o");
	$("#star2").css("color","black");
	$("#star5").removeClass("fa fa-star");
	$("#star5").addClass("fa fa-star-o");
	$("#star5").css("color","black");
	$("#star3").removeClass("fa fa-star");
	$("#star3").addClass("fa fa-star-o");
	$("#star3").css("color","black");
	$("#star4").removeClass("fa fa-star");
	$("#star4").addClass("fa fa-star-o");
	$("#star4").css("color","black");
	$(".star i").unbind("mouseover");
	$(".star i").unbind("mouseleave");
	$(".star span").html("基本不运动");
	sport = "基本不运动";
});
$("#star2").click(function(){
	$("#star2").removeClass("fa fa-star-o");
	$("#star2").addClass("fa fa-star");
	$("#star2").css("color","gold");
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$("#star5").removeClass("fa fa-star");
	$("#star5").addClass("fa fa-star-o");
	$("#star5").css("color","black");
	$("#star3").removeClass("fa fa-star");
	$("#star3").addClass("fa fa-star-o");
	$("#star3").css("color","black");
	$("#star4").removeClass("fa fa-star");
	$("#star4").addClass("fa fa-star-o");
	$("#star4").css("color","black");
	$(".star i").unbind("mouseover");
	$(".star i").unbind("mouseleave");
	$(".star span").html("运动较少");
	sport = "运动较少";
});
$("#star3").click(function(){
	$("#star3").removeClass("fa fa-star-o");
	$("#star3").addClass("fa fa-star");
	$("#star3").css("color","gold");
	$("#star2").removeClass("fa fa-star-o");
	$("#star2").addClass("fa fa-star");
	$("#star2").css("color","gold");
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$("#star5").removeClass("fa fa-star");
	$("#star5").addClass("fa fa-star-o");
	$("#star5").css("color","black");
	$("#star4").removeClass("fa fa-star");
	$("#star4").addClass("fa fa-star-o");
	$("#star4").css("color","black");
	$(".star i").unbind("mouseover");
	$(".star i").unbind("mouseleave");
	$(".star span").html("运动一般");
	sport = "运动一般";
});
$("#star4").click(function(){
	$("#star4").removeClass("fa fa-star-o");
	$("#star4").addClass("fa fa-star");
	$("#star4").css("color","gold");
	$("#star3").removeClass("fa fa-star-o");
	$("#star3").addClass("fa fa-star");
	$("#star3").css("color","gold");
	$("#star2").removeClass("fa fa-star-o");
	$("#star2").addClass("fa fa-star");
	$("#star2").css("color","gold");
	$("#star1").removeClass("fa fa-star-o");
	$("#star1").addClass("fa fa-star");
	$("#star1").css("color","gold");
	$("#star5").removeClass("fa fa-star");
	$("#star5").addClass("fa fa-star-o");
	$("#star5").css("color","black");
	$(".star i").unbind("mouseover");
	$(".star i").unbind("mouseleave");
	$(".star span").html("经常运动");
	sport = "经常运动";
});
$("#star5").click(function(){
	$(".star i").removeClass("fa fa-star-o");
	$(".star i").addClass("fa fa-star");
	$(".star i").css("color","gold");
	$(".star i").unbind("mouseleave");
	$(".star span").html("运动狂人");
	sport = "运动狂人";
});

function biankuang(obj){
    $(obj).find('.show-style').stop(true).animate({
        height:'305px'
    },300)
}
//边框效果--移出
function biankuang1(obj){

    $(obj).find('.show-style').stop(true).delay(100).animate({
        height:'0px'
    },100)
}
//触发
$('.show-style').hover(
	function () {
	  var obj = $(this);
			$(obj).find('.show-style').animate({left:'150',opacity:1},300);
		biankuang(obj);
	},
	function () {
	  var obj = $(this);
		$(obj).find('.show-style').animate({left:'100',opacity:0},300);
		biankuang1(obj);
	}
);