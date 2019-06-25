<%@ page import="com.ssm.yingjia.po.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>营"+"生活-首页</title>
    <link href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/js/libs/font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
</head>
<body id="mydiv">
<header>
    <img src="${pageContext.request.contextPath}/img/logo.png" height="70px" alt="营+" class="logo-style">
    <ul>
        <li style="border-style: none; background-color: #09AB6B; color: white;">网站首页</li>
        <li>日常推送</li>
        <li>定制菜品</li>
        <li>我的信息</li>
        <div class="login">
            <%
                User user = (User) session.getAttribute("currentUser");
                if(user==null){ %>
            <a href="/login_page" style="color: black"><div class="btn-login">登录</div></a>
            <a href="/register_page"><div class="btn-regist">注册</div></a>
            <%}else{%>
            <div class="login-user dropdown-toggle" data-toggle="dropdown">
                <%if(user.getUserPic()==null){%>
                <img src="${pageContext.request.contextPath}/img/11.png">
                <%}else{%>
                <img src="${pageContext.request.contextPath}/img/<%=user.getUserPic()%>">
                <%}%>
                <%=user.getUserNickname()%></div>
            <div class="dropdown-menu" style="font-size: 14px;">
                <a class="dropdown-item" style="cursor: pointer;">我的信息</a>
                <a class="dropdown-item" style="cursor: pointer;">注销</a>
            </div>
            <%}%>
        </div>
    </ul>
</header>
<div id="demo" class="carousel slide" data-ride="carousel" style="width: 1000px; margin: auto;margin-top: 20px;">

    <!-- 指示符 -->
    <ul class="carousel-indicators">
        <li data-target="#demo" data-slide-to="0" class="active"></li>
        <li data-target="#demo" data-slide-to="1"></li>
        <li data-target="#demo" data-slide-to="2"></li>
    </ul>

    <!-- 轮播图片 -->
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="${pageContext.request.contextPath}/img/ad-1.jpg">
        </div>
        <div class="carousel-item">
            <img src="${pageContext.request.contextPath}/img/ad-8.jpg">
        </div>
        <div class="carousel-item">
            <img src="http://static.runoob.com/images/mix/img_mountains_wide.jpg">
        </div>
    </div>

    <!-- 左右切换按钮 -->
    <a class="carousel-control-prev" href="#demo" data-slide="prev">
        <span class="carousel-control-prev-icon"></span>
    </a>
    <a class="carousel-control-next" href="#demo" data-slide="next">
        <span class="carousel-control-next-icon"></span>
    </a>

</div>
<div class="text-content">
    <ul class="lightchat">
        <li  data-toggle="modal" data-target="#myModal">
            <h2>营养方案</h2>
            <img src="${pageContext.request.contextPath}/img/fangan.png">
            <h5 style="color: gray;" id="plancheck">选择您的营养方案</h5>
        </li>
        <li style="margin: 0 12.5%;"  data-toggle="modal" data-target="#myModal2">
            <h2>个性化</h2>
            <img src="${pageContext.request.contextPath}/img/gexinghua.png" style="margin-bottom: 0;">
            <h5 style="color: gray;" id="plancheck2">设置您的个性化参数</h5>
        </li>
        <li style="float: right;" data-toggle="modal" data-target="#myModal3">
            <h2>用餐明细</h2>
            <img src="${pageContext.request.contextPath}/img/mingxi.png">
            <h5 style="color: gray;" id="plancheck3">用餐时间与类型选择</h5>
        </li>
    </ul>
</div>
<div class="show-view">
    <div class="show-border">
        <div style="text-align: center;font-size: 23px;">为您推荐的菜谱</div>
        <div class="show-img">
            <img src="${pageContext.request.contextPath}/img/AD_03.png" class="show-style">
            <div>加多宝凉茶</div>
        </div>
        <div class="show-img">
            <img src="${pageContext.request.contextPath}/img/AD_04.png" class="show-style">
            <div>蜂蜜柚子茶</div>
        </div>
        <div class="show-img">
            <img src="${pageContext.request.contextPath}/img/AD_06.png" class="show-style">
            <div>益昌香滑奶茶</div>
        </div>
        <div class="show-img">
            <img src="${pageContext.request.contextPath}/img/AD_03.png" class="show-style">
            <div>加多宝凉茶</div>
        </div>
        <div class="show-img">
            <img src="${pageContext.request.contextPath}/img/AD_03.png" class="show-style">
            <div>加多宝凉茶</div>
        </div>
        <div style="clear: both;"></div>
    </div>
</div>
<!-- 模态框1 -->
<div class="modal fade" id="myModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-body">
                <div class="plan">
                    <div class="plan-radio">
                        <div class="plan-input">
                            <input type="radio" id="jianfei" name="plan" checked="checked" value="减肥方案">
                            <label for="jianfei">减肥方案</label>
                        </div>
                        <div class="plan-input">
                            <input type="radio" id="zengfei" name="plan" value="增肥方案">
                            <label for="zengfei">增肥方案</label>
                        </div>
                        <div class="plan-input">
                            <input type="radio" id="jianshen" name="plan" value="健身方案">
                            <label for="jianshen">健身方案</label>
                        </div>
                        <input type="button" value="确认" class="btn btn-primary" style="margin: 20px;"  data-dismiss="modal" id="checkplan">
                        <input type="button" value="取消" class="btn btn-secondary" style="margin: 20px;"  data-dismiss="modal">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 模态框2 -->
<div class="modal fade" id="myModal2">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-body">
                <div class="indiv">
                    <p class="indiv-title"><i class="fa fa-circle" style="font-size: 18px; color: #90b830; margin-right: 10px;"></i>口味</p>
                    <span class="flover">
			          			<input type="radio" id="acid" name="flover" value="酸" checked="checked">
			          			<label for="acid">酸</label>
		          			</span>
                    <span class="flover">
			          			<input type="radio" id="sweet" name="flover" value="甜">
			          			<label for="sweet">甜</label>
		          			</span>
                    <span class="flover">
			          			<input type="radio" id="spicy" name="flover" value="麻辣">
			          			<label for="spicy">麻辣</label>
		          			</span>
                    <span class="flover">
			          			<input type="radio" id="delicate" name="flover" value="清淡">
			          			<label for="delicate">清淡</label>
		          			</span>
                    <p class="indiv-title"><i class="fa fa-circle" style="font-size: 18px; color: #90b830; margin-right: 10px;"></i>饮品偏好</p>
                    <span class="drink">
			          			<input type="radio" id="drink1" name="drink" value="碳酸饮料" checked="checked">
			          			<label for="drink1">碳酸饮料</label>
		          			</span>
                    <span class="drink">
			          			<input type="radio" id="drink2" name="drink" value="果蔬汁饮料">
			          			<label for="drink2">果蔬汁饮料</label>
		          			</span>
                    <span class="drink">
			          			<input type="radio" id="drink3" name="drink" value="功能饮料">
			          			<label for="drink3">功能饮料</label>
		          			</span>
                    <span class="drink">
			          			<input type="radio" id="drink4" name="drink" value="茶类饮料">
			          			<label for="drink4">茶类饮料</label>
		          			</span>
                    <span class="drink">
			          			<input type="radio" id="drink5" name="drink" value="咖啡饮料">
			          			<label for="drink5">咖啡饮料</label>
		          			</span>
                    <p class="indiv-title"><i class="fa fa-circle" style="font-size: 18px; color: #90b830; margin-right: 10px;"></i>食物过敏原（没有则不选）</p>
                    <span class="drink">
			          			<input type="checkbox" id="allergy1" name="allergy" value="甲壳类动物">
			          			<label for="allergy1">甲壳类动物</label>
		          			</span>
                    <span class="drink">
			          			<input type="checkbox" id="allergy2" name="allergy" value="蛋类及其产品">
			          			<label for="allergy2">蛋类及其产品</label>
		          			</span>
                    <span class="drink">
			          			<input type="checkbox" id="allergy3" name="allergy" value="牛奶与奶制品">
			          			<label for="allergy3">牛奶与奶制品</label>
		          			</span>
                    <span class="drink">
			          			<input type="checkbox" id="allergy4" name="allergy" value="花生及其产品">
			          			<label for="allergy4">花生及其产品</label>
		          			</span>
                    <p class="indiv-title"><i class="fa fa-circle" style="font-size: 18px; color: #90b830; margin-right: 10px;"></i>运动指数</p>
                    <div class="star">
                        <i class="fa fa-star-o star-style" id="star1"></i>
                        <i class="fa fa-star-o star-style" id="star2"></i>
                        <i class="fa fa-star-o star-style" id="star3"></i>
                        <i class="fa fa-star-o star-style" id="star4"></i>
                        <i class="fa fa-star-o star-style" id="star5"></i>
                        <span style="font-size: 18px;margin-right: 10px;"></span>
                    </div>
                    <div style="text-align: center;">
                        <input type="button" value="确认" class="btn btn-primary" style="margin: 20px;"  data-dismiss="modal" id="checkplan2">
                        <input type="button" value="取消" class="btn btn-secondary" style="margin: 20px;"  data-dismiss="modal">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 模态框3 -->
<div class="modal fade" id="myModal3">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-body">
                <div class="indiv">
                    <p class="indiv-title"><i class="fa fa-circle" style="font-size: 18px; color: #90b830; margin-right: 10px;"></i>用餐时间</p>
                    <span class="flover">
			          			<input type="radio" id="break" name="eat" value="早餐" checked="checked">
			          			<label for="break">早餐</label>
		          			</span>
                    <span class="flover">
			          			<input type="radio" id="lunch" name="eat" value="午餐">
			          			<label for="lunch">午餐</label>
		          			</span>
                    <span class="flover">
			          			<input type="radio" id="dinner" name="eat" value="晚餐">
			          			<label for="dinner">晚餐</label>
		          			</span>
                    <span class="flover">
			          			<input type="radio" id="snack" name="eat" value="宵夜">
			          			<label for="snack">宵夜</label>
		          			</span>
                    <p class="indiv-title"><i class="fa fa-circle" style="font-size: 18px; color: #90b830; margin-right: 10px;"></i>类型</p>
                    <span class="drink">
			          			<input type="radio" id="single" name="type" value="单人套餐" checked="checked">
			          			<label for="single">单人套餐</label>
		          			</span>
                    <span class="drink">
			          			<input type="radio" id="double" name="type" value="双人套餐">
			          			<label for="double">双人套餐</label>
		          			</span>
                    <span class="drink">
			          			<input type="radio" id="other" name="type" value="其他">
			          			<label for="other">其他</label>
		          			</span>
                    <div style="text-align: center;margin-top: 50px;">
                        <input type="button" value="确认" class="btn btn-primary" style="margin: 20px;"  data-dismiss="modal" id="checkplan3">
                        <input type="button" value="取消" class="btn btn-secondary" style="margin: 20px;"  data-dismiss="modal">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<footer>关于我们 - 联系我们</footer>
</body>
<script src="${pageContext.request.contextPath}/js/libs/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/libs/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/controllers/index.js"></script>
<script src="${pageContext.request.contextPath}/js/libs/canvas-particle.js"></script>
</html>
