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
    <title>营＋ - 登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome-4.7.0/css/font-awesome.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/StringUtil.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js" ></script>
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
            <form class="login-form" id="login-form">
                <label>
                    <input class="login-input" id="userPhone-input" name="userPhone" type="text" placeholder="手机号" />
                </label>
                <label>
                    <input class="login-input login-input-password" id="userPassword-input"  name="userPassword" type="password" placeholder="密码" onblur="passwordBlur();" />
                    <input class="login-input login-input-password-text" type="text" placeholder="密码" onblur="textBlur()" style="display: none;" />
                    <i class="fa fa-eye-slash login-eye-slash" onclick="swithPassword();"></i>
                    <i class="fa fa-eye login-eye" style="display: none;" onclick="swithPassword();"></i>
                </label>
                <label>
                    <div class="login-forgetpassword"><a href="/login_page">忘记密码？</a></div>
                </label>
                <!--此处不用label，防止label扩大按钮的触发范围-->
                <div>
                    <button class="login-submit" id="login-submit" type="button">登&nbsp;录</button>
                </div>
            </form>
        </div>
        <div class="main-footer">
            <div class="footer-register">没有账号？<a href="/register_page">注册</a></div>
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
        $(".login-input-password").toggle();
        $(".login-input-password-text").toggle();
        $(".login-eye-slash").toggle();
        $(".login-eye").toggle();
    }
    //password框失去焦点把password框的值赋值给text框
    function passwordBlur() {
        $(".login-input-password-text").val($(".login-input-password").val());
    }
    //text框失去焦点把text框的值赋值给password框
    function textBlur() {
        $(".login-input-password").val($(".login-input-password-text").val());
    }

</script>
</html>
