<%@ page import="com.ssm.yingjia.po.User" %>
<%@ page import="com.ssm.yingjia.po.Push" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.ssm.yingjia.po.PushVo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
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
			<li>网站首页</li>
            <a href="/push?currPage=1"><li style="border-style: none; background-color: #09AB6B; color: white;">日常推送</li></a>
			<li>定制菜品</li>
			<a href="personal"><li>我的信息</li></a>
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
                    <a href="/push?currPage=1"><li class="btn-success">全部消息</li></a>
                    <a href="/pushbytype?pushtype=1&currPage=1"><li class="btn-success btnhidden">营养知识</li></a>
                    <a href="/pushbytype?pushtype=2&currPage=1"><li class="btn-success btnhidden">行业新闻</li></a>
                    <a href="/pushbytype?pushtype=3&currPage=1"><li class="btn-success btnhidden">营养方案</li></a>
				</ul>
			</div>

			<div class="push-right">
				<%
					List<PushVo> list = (List<PushVo>) request.getAttribute("push");
					for (int i=0;i<list.size();i++){
				%>
				<div class="push-item">
					<div class="push-title"><%=list.get(i).getPushName()%></div>
					<div class="detail">
						<span class="push-detail"><%=list.get(i).getPushContent().substring(0,30)+"..."%></span>
						<span class="push-name"><i class="fa fa-user" style="margin-right: 3px;"></i><%=list.get(i).getDietitian().getDietitianNickname()%></span>
					</div>
					<div style="clear: both;"></div>
					<div class="time">
						<span class="push-tag"><i class="fa fa-tag" style="margin-right: 3px;"></i><%int type =list.get(i).getPushType();
							if(type==1){ %><%="营养知识"%><%}
							else if (type==2){ %><%="行业新闻"%><%}
							else if (type==3){ %><%="营养方案"%><%}
							else{ %><%="行业新闻"%><%}%>
						</span>
						<span class="push-time"><i class="fa fa-calendar" style="margin-right: 3px;"></i><%=new SimpleDateFormat("yyyy-MM-dd").format(list.get(i).getPushTime())%></span>
					</div>
				</div>
				<%}%>
                <%
                    Integer Page = (Integer) request.getAttribute("PageCount");
                %>
                <div id="page1">
				<ul class="pagination pagination-lg">
				  	<li class="page-item"><a class="page-link" href="/push?currPage=1">首页</a></li>
                    <%
                         for (Integer j=0;j<Page;j++){
                    %>
				 	 <li class="page-item"><a class="page-link" href="/push?currPage=<%=j+1%>"><%=j+1%></a></li>
                    <%}%>
				 	 <li class="page-item"><a class="page-link" href="/push?currPage=<%=Page%>">末页</a></li>
				</ul>
                </div>
			</div>
		</div>
	</body>
	<script src="${pageContext.request.contextPath}/js/libs/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/controllers/push.js"></script>
	<script src="${pageContext.request.contextPath}/js/libs/canvas-particle.js"></script>
</html>
