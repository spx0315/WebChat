<%--
  Created by IntelliJ IDEA.
  User: keji0
  Date: 2019/2/20
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="" method="post">
    <input name="userName" type="text" />
    <br/>
    <input name="password" type="password"/>
    <br/>
    <input id="submitButton"  type="submit" value="登录" align="center" onclick="javascript:this.form.action='login.html'"/>
    <input id="registerButton" type="submit" value="注册" align="center" onclick="javascript:this.form.action='register.html'"/>
</form>
</body>
</html>

