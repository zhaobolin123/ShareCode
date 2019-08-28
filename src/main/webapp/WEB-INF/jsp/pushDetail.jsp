<%@ page import="com.ssm.yingjia.po.User" %>
<%@ page import="com.ssm.yingjia.po.Push" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>营"+"生活-文章详情</title>
		<link href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/js/libs/font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/pushDetail.css" rel="stylesheet">
	</head>
	<body id="mydiv">
	<header>
		<img src="${pageContext.request.contextPath}/img/logo.png" height="70px" alt="营+" class="logo-style">
		<ul>
			<li style="border-style: none; background-color: #09AB6B; color: white;">网站首页</li>
			<a href="/pushbytype?pushtype=0&currPage=1"><li>日常推送</li></a>
			<li>定制菜品</li>
			<li>我的信息</li>
			<div class="login">
				<%
					User user = (User) session.getAttribute("currentUser");
					Push push = (Push)request.getAttribute("pushDetail");
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
			<div class="detail-box">
			<h2 class="detail-title"><%=push.getPushName()%></h2>
			<div class="publisher">
				<div class="publisher-name"><%=push.getDietitian_nickname()%></div>
				<div class="publisher-time"><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(push.getPushTime())%></div>
			</div>
			<div class="detail-content">
				<pre class="detail-pre"><%=push.getPushContent()%></pre>
			</div>
			</div>
		</div>
	</body>
	<script src="${pageContext.request.contextPath}/js/libs/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/controllers/pushDetail.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/canvas-particle.js"></script>
</html>
