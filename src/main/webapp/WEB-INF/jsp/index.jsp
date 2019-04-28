<%@ page import="com.ssm.yingjia.po.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<h4>
    这是一个测试页面！
    <%User user = (User) request.getAttribute("test");%>
    <%=user.getUserName()%>
    <br>____________<br>
    ${test.userName}
</h4>
</body>
</html>
