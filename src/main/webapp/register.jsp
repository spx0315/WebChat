<%--
  Created by IntelliJ IDEA.
  User: keji0
  Date: 2019/2/20
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<div id="register">
    <h1>账号注册</h1>
    <form id="submitForm">
        <input type="text" required="required" placeholder="用户名" name="username" id="username">
        <br>
        <input type="password" required="required" placeholder="密码" name="password">
        <br>
        <div id="err" style="color: red; margin-top: -5px; margin-bottom: 5px;"></div>
        <button type="button" class="but" onclick="javascript:login();" >登录</button>
    </form>
</div>
</body>
</html>

