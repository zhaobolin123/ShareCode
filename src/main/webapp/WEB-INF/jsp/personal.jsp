<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.ssm.yingjia.po.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>营"+"生活-我的信息</title>
    <link href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/js/libs/font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/personal.css" rel="stylesheet">
</head>
<body id="mydiv">
<header>
    <img src="img/logo.png" height="70px" alt="营+" class="logo-style">
    <ul>
        <li>网站首页</li>
        <a href="/pushbytype?pushtype=0&currPage=1"><li>日常推送</li></a>
        <li>定制菜品</li>
        <a href="/personal"><li style="border-style: none; background-color: #09AB6B; color: white;">我的信息</li></a>
        <%--<!--<div class="login">--%>
                <%--<%--%>
                    <%--User user = (User) session.getAttribute("currentUser");--%>
                    <%--if(user==null){ %>--%>
                <%--<a href="/login_page" style="color: black"><div class="btn-login">登录</div></a>--%>
                <%--<a href="/register_page"><div class="btn-regist">注册</div></a>--%>
                <%--<%}else{%>--%>
                <%--<div class="login-user dropdown-toggle" data-toggle="dropdown">--%>
                    <%--<%if(user.getUserPic()==null){%>--%>
                    <%--<img src="${pageContext.request.contextPath}/img/11.png">--%>
                    <%--<%}else{%>--%>
                    <%--<img src="${pageContext.request.contextPath}/img/<%=user.getUserPic()%>">--%>
                    <%--<%}%>--%>
                    <%--<%=user.getUserNickname()%></div>--%>
                <%--<div class="dropdown-menu" style="font-size: 14px;">--%>
                    <%--<a class="dropdown-item" style="cursor: pointer;">我的信息</a>--%>
                    <%--<a class="dropdown-item" style="cursor: pointer;">注销</a>--%>
                <%--</div>--%>
            <%--<%}%>--%>
        <%--</div>-->--%>
    </ul>
</header>
<% User user = (User) session.getAttribute("currentUser");%>
<div id="demo" class="carousel slide" data-ride="carousel" style="width: 1000px; margin: auto;margin-top: 20px;">
    <div class="info-bar">
        <div class="info-item info-item-img">
            <img  style="margin: 0 auto; width: 120px; height:120px; border-radius: 50%;" src="${pageContext.request.contextPath}/img/portrait/<%=user.getUserPic()%>" >
            <span class="info-bt"  data-toggle="modal" data-target="#modal-updateImg">修改头像</span>
        </div>
        <div class="info-item">
            <div class="info-name">昵称：</div>
            <div class="info-value"><%=user.getUserNickname()%></div>
        </div>
        <div class="info-item">
            <div class="info-name">电话：</div>
            <div class="info-value"><%=user.getUserPhone()%></div>
        </div>
        <div class="info-item">
            <div class="info-name">密码：</div>
            <div class="info-value">已设置</div>
        </div>
        <div class="info-item">
            <div class="info-name">真实姓名：</div>
            <% if (user.getUserName() == null){%>
                <div class="info-value">*未设置</div>
            <%}else{%>
                <div class="info-value"><%=user.getUserName()%></div>
            <%}%>
        </div>
        <div class="info-item">
            <div class="info-name">身份证号：</div>
            <% if (user.getUserName() == null){%>
                <div class="info-value">*未设置</div>
            <%}else{%>
                <div class="info-value"><%=user.getUserNumber()%></div>
            <%}%>
        </div>
        <div class="info-item">
            <div class="info-name">身高：</div>
            <% if (user.getUserName() == null){%>
                <div class="info-value">*未设置</div>
            <%}else{%>
                <div class="info-value"><%=user.getUserHeight()%></div>
            <%}%>
        </div>
        <div class="info-item">
            <div class="info-name">体重：</div>
            <% if (user.getUserName() == null){%>
                <div class="info-value">*未设置</div>
            <%}else{%>
                <div class="info-value"><%=user.getUserWeight()%></div>
            <%}%>
        </div>
        <div class="info-item">
            <div class="info-name">生日：</div>
            <% if (user.getUserName() == null){%>
                <div class="info-value">*未设置</div>
            <%}else{%>
                <div class="info-value"><%=user.getUserBirth()%></div>
            <%}%>
        </div>
        <div class="info-item">
            <div class="info-name">性别：</div>
            <% if (user.getUserName() == null){%>
                <div class="info-value">*未设置</div>
            <%}else{%>
                <div class="info-value"><%=user.getSex()%></div>
            <%}%>
        </div>
        <div class="info-item">
            <div class="info-name">家乡：</div>
            <% if (user.getUserName() == null){%>
                <div class="info-value">*未设置</div>
            <%}else{%>
                <div class="info-value"><%=user.getHometown()%></div>
            <%}%>
        </div>
        <div class="info-item info-item-bt">
            <span class="info-bt" data-toggle="modal" data-target="#modal-updatePswd">修改密码</span>
            <span class="info-bt" data-toggle="modal" data-target="#modal-updateInfo">完善资料</span>
        </div>
    </div>
</div>

<!--修改头像模态框-->
<div class="modal fade" id="modal-updateImg" tabindex="-1" role="dialog" aria-labelledby="modalLabel-updateImg" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="modalLabel-updateImg">
                    修改头像
                </h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
            </div>
            <div class="modal-body">
                <form id="form-updateImg" enctype="multipart/form-data">
                    <input type="file" name="updateFile" accept="image/jpeg,image/png" id="input-updateImg" style="display: none;"  onchange="imgChanged(this)"/>
                    <img id="img-updateImg" src="${pageContext.request.contextPath}/img/portrait/<%=user.getUserPic()%>" style="width: 240px; height: 240px;" />
                    <span id="bt-changeImg" class="info-bt" >选择图片</span>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">
                    关闭
                </button>
                <button id="modal-updateImg-bt" type="button" class="btn btn-primary" style="background-color: #09AB6B;">
                    确认修改
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 修改密码模态框 -->
<div class="modal fade" id="modal-updatePswd" tabindex="-1" role="dialog" aria-labelledby="modalLabel-updatePswd" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="modalLabel-updatePswd">
                    修改密码
                </h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
            </div>
            <div class="modal-body">
                <form id="form-updatePswd" method="post">
                    <label for="oldPassword">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;原密码：</label>
                    <input type="password" name="oldPassword" id="oldPassword" value="" />
                    <label id="warning-for-oldPswd" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="newPassword">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新密码：</label>
                    <input type="password" name="newPassword" id="newPassword" value="" />
                    <label id="warning-for-newPswd" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="newPassword2">确认新密码：</label>
                    <input type="password" name="newPassword2" id="newPassword2" value="" />
                    <label id="warning-for-newPswd2" style="color: red;font-size: 10pt;"></label>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">
                    关闭
                </button>
                <button id="modal-updatePswd-bt" type="button" class="btn btn-primary" style="background-color: #09AB6B;">
                    确认修改
                </button>
            </div>
        </div>
    </div>
</div>
<!-- 完善资料模态框 -->
<div class="modal fade" id="modal-updateInfo" tabindex="-1" role="dialog" aria-labelledby="modalLabel-updateInfo" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="modalLabel-updateInfo">
                    完善资料
                </h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
            </div>
            <div class="modal-body">
                <form id="form-updateInfo">
                    <label for="userNickname">昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</label>
                    <input type="text" name="userNickname" id="userNickname" value="" />
                    <label id="warning-for-userNickname" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="userPhone">电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：</label>
                    <input type="text" name="userPhone" id="userPhone" value="" />
                    <label id="warning-for-userPhone" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="userName">真实姓名：</label>
                    <input type="text" name="userName" id="userName" value="" />
                    <label id="warning-for-userName" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="userNumber">身份证号：</label>
                    <input type="text" name="userNumber" id="userNumber" value="" />
                    <label id="warning-for-userNumber" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="userHeight">身&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;高：</label>
                    <input type="text" name="userHeight" id="userHeight" value="" />
                    <label id="warning-for-userHeight" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="userWeight">体&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;重：</label>
                    <input type="text" name="userWeight" id="userWeight" value="" />
                    <label id="warning-for-userWeight" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="userBirth">生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日：</label>
                    <input type="date" name="userBirth" id="userBirth" style="border: 1px solid #A9A9A9;" value="" />
                    <label id="warning-for-userBirth" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
                    <input type="radio" name="sex" id="sex1" value="1" /><label for="sex1">男</label>
                    &nbsp;&nbsp;&nbsp;
                    <input type="radio" name="sex" id="sex2" value="2" /><label for="sex2">女</label>
                    <label id="warning-for-sex" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                    <label for="hometown">家&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;乡：</label>
                    <input type="text" name="hometown" id="hometown" value="" />
                    <label id="warning-for-hometown" style="color: red;font-size: 10pt;"></label>
                    <br />
                    <br />
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">
                    关闭
                </button>
                <button id="modal-updateInfo-bt" type="button" class="btn btn-primary" style="background-color: #09AB6B;">
                    确认修改
                </button>
            </div>
        </div>
    </div>
</div>

</body>
<script src="${pageContext.request.contextPath}/js/libs/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/libs/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/StringUtil.js"></script>
<script src="${pageContext.request.contextPath}/js/controllers/personal.js"></script>
<script src="${pageContext.request.contextPath}/js/libs/canvas-particle.js"></script>
</html>

