<%--
  Created by IntelliJ IDEA.
  User: 友人A
  Date: 2019/6/23
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>营＋ - 注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome-4.7.0/css/font-awesome.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css" />

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/StringUtil.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/register.js" ></script>
</head>
<body>

<img class="bg-img" src="${pageContext.request.contextPath}/img/bg.jpg" />
<div class="container-main">
    <div class="main-box">
        <div class="main-header">
            <img class="header-img" src="${pageContext.request.contextPath}/img/logo.png" />
        </div>
        <div class="main-body">
            <div class="main-body-title">回到营+，享受生活</div>
            <form class="register-form" id="register-form">
                <label>
                    <input class="register-input" id="userNickname-input" name="userNickname" type="text" placeholder="昵称" />
                </label>
                <label>
                    <input class="register-input" id="userPhone-input" name="userPhone" type="text" placeholder="手机号" />
                </label>
                <label>
                    <input class="register-input register-input-password" id="userPassword-input"  name="userPassword" type="password" placeholder="密码" onblur="passwordBlur();" />
                    <input class="register-input register-input-password-text" type="text" placeholder="密码" onblur="textBlur()" style="display: none;" />
                    <i class="fa fa-eye-slash register-eye-slash" onclick="swithPassword();"></i>
                    <i class="fa fa-eye register-eye" style="display: none;" onclick="swithPassword();"></i>
                </label>
                <%--<label>--%>
                    <%--<input class="register-input" type="date" placeholder="生日" />--%>
                <%--</label>--%>
                <!--此处不用label，防止label扩大按钮的触发范围-->
                <div>
                    <button class="register-submit" id="register-submit" type="button" >注&nbsp;册</button>
                </div>
            </form>
        </div>
        <div class="main-footer">
            <div class="footer-register">已有账号？<a href="/login_page">登录</a></div>
        </div>
    </div>
</div>
<div class="container-foot">
    <div class="foot_info">
        &copy;2018  营＋
    </div>
</div>
</body>

<script>
    //切换密码明文的按钮
    function swithPassword(){
        $(".register-input-password").toggle();
        $(".register-input-password-text").toggle();
        $(".register-eye-slash").toggle();
        $(".register-eye").toggle();
    }
    //password框失去焦点把password框的值赋值给text框
    function passwordBlur() {
        $(".register-input-password-text").val($(".register-input-password").val());
    }
    //text框失去焦点把text框的值赋值给password框
    function textBlur() {
        $(".register-input-password").val($(".register-input-password-text").val());
    }

</script>
</html>
