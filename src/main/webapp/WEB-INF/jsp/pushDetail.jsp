<%@ page import="com.ssm.yingjia.po.User" %>
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
			<div class="detail-box">
			<h2 class="detail-title">我是你哥哥</h2>	
			<div class="publisher">
				<div class="publisher-time">2019-6-25 23:39:35</div>
				<div class="publisher-name">赵博林</div>
			</div>
			<div class="detail-content">
				<pre class="detail-pre">
好消息！今晚油价又要降了！

根据国家发改委消息，新一轮成品油调价窗口将于今天（6月25日）24时开启。

据国家发改委价格监测中心监测，本轮成品油调价周期内（6月11日—6月24日），国际油价在近几个月来的低位宽幅震荡。平均来看，两市油价比上轮调价周期下降2.24%，受此影响，国内汽油、柴油零售价格随之下调。

成品油价格下调 加满一箱油少花4.5元
央视财经记者从国家发改委获悉，本次油价调整具体情况如下：汽油每吨下调120元、柴油每吨下调115元。

全国平均来看：

92号汽油每升下调0.09元；

95号汽油每升下调0.10元；

0号柴油每升下调0.10元。

央视财经记者给您算了一笔账，按一般家用汽车油箱50L容量估测，加满一箱92号汽油，将少花4.5元。

贸易争端、美国原油产量等因素影响国际油价低位宽幅震荡

在本轮调价周期的开始，贸易争端、美国原油产量进一步攀升等因素继续压低国际油价，伦敦布伦特、纽约WTI油价降至每桶60美元和51美元的近五个月低位。此后，中东油轮遇袭、伊朗击落美国无人机导致美伊关系持续紧张，贸易争端有所缓和，以及美联储可能降息等一系列消息推动原油价格大幅攀升，两市油价分别涨至每桶65美元和58美元的近一个月高点。美国原油库存减少也支撑油价上涨。


				</pre>
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
