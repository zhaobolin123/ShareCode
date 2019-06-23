<%@ page import="com.ssm.yingjia.po.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<h4>
    这是一个测试登录后页面！
    <%User user = (User) session.getAttribute("currentUser");%>
    <br>____________<br>
    当前用户信息：
    <br>____________<br>
    id: <%=user.getUserId()%>
    <br>____________<br>
    nickname: <%=user.getUserNickname()%>
    <br>____________<br>
    phone: <%=user.getUserPhone()%>
    <br>____________<br>
    password: <%=user.getUserPassword()%>
    <br>____________<br>
    number: <%=user.getUserNumber()%>
    <br>____________<br>
    name: <%=user.getUserName()%>
    <br>____________<br>
    sex: <%=user.getSex()%>
    <br>____________<br>
    hometown: <%=user.getHometown()%>
    <br>____________<br>
    birthday: <%=user.getUserBirth()%>
    <br>____________<br>
    height: <%=user.getUserHeight()%>
    <br>____________<br>
    weight: <%=user.getUserWeight()%>
    <br>____________<br>
    pic: <%=user.getUserPic()%>
    <br>____________<br>
    time: <%=user.getUserTime()%>
    <br>____________<br>
</h4>
</body>
</html>
