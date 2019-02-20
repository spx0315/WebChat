<%--
  Created by IntelliJ IDEA.
  User: keji0
  Date: 2019/2/20
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
</head>
<body>
<div id="login">
    <h1>登录系统</h1>
    <form id="submitForm" action="LoginServlet" method="post">
        <input type="text" required="required" placeholder="用户名" name="username" id="username"/>
        <br>
        <input type="password" required="required" placeholder="密码" name="password"/>
        <br>
        <div id="err" style="color: red; margin-top: -5px; margin-bottom: 5px;"></div>
        <button type="button" class="but" onclick="javascript:login();" >登录</button>
    </form>
</div>
</body>
</html>
