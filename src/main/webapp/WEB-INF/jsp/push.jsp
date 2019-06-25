<%@ page import="com.ssm.yingjia.po.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>营"+"生活-日常推送</title>
		<link href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/js/libs/font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/push.css" rel="stylesheet">
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
			<div class="push-left">
				<div class="push-classify">推送分类</div>
				<ul>
					<li class="btn-success">全部消息</li>
					<li class="btn-success">营养知识</li>
					<li class="btn-success">行业新闻</li>
					<li class="btn-success">营养方案</li>
				</ul>
			</div>
			<div class="push-right">
				<div class="push-item">
					<div class="push-title">我是你哥哥</div>
					<div class="detail">
						<span class="push-detail">我是你哥哥阿萨德阿萨德啊</span>
						<span class="push-name"><i class="fa fa-user" style="margin-right: 3px;"></i>哆啦做a梦</span>
					</div>
					<div style="clear: both;"></div>
					<div class="time">
						<span class="push-tag"><i class="fa fa-tag" style="margin-right: 3px;"></i>营养知识</span>
						<span class="push-time"><i class="fa fa-calendar" style="margin-right: 3px;"></i>2019-04-12</span>
					</div>
				</div>
				
				<div class="push-item">
					<div class="push-title">我是你哥哥</div>
					<div class="detail">
						<span class="push-detail">我是你哥哥</span>
						<span class="push-name"><i class="fa fa-user" style="margin-right: 3px;"></i>哆啦做a梦</span>
					</div>
					<div style="clear: both;"></div>
					<div class="time">
						<span class="push-tag"><i class="fa fa-tag" style="margin-right: 3px;"></i>营养知识</span>
						<span class="push-time"><i class="fa fa-calendar" style="margin-right: 3px;"></i>2019-04-12</span>
					</div>
				</div>
				<ul class="pagination pagination-lg">
				  	<li class="page-item"><a class="page-link" href="#">首页</a></li>
				 	 <li class="page-item"><a class="page-link" href="#">1</a></li>
				  	<li class="page-item"><a class="page-link" href="#">2</a></li>
				 	 <li class="page-item"><a class="page-link" href="#">3</a></li>
				 	 <li class="page-item"><a class="page-link" href="#">末页</a></li>
				</ul>
			</div>
		</div>
	</body>
	<script src="${pageContext.request.contextPath}/js/libs/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/controllers/push.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/canvas-particle.js"></script>
</html>
