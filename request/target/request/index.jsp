<%--
  Created by IntelliJ IDEA.
  User: wangkejing
  Date: 2023-05-27 027
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<div style="display: flex;align-content: center">
    <div>
        <form action="${pageContext.request.contextPath}/login" method="post">
            用户名：<input type="text" name="username"/>
            密码： <input type="password" name="password"/>
            爱好：
            <input type="checkbox" name="hobbys" value="女孩"/>女孩
            <input type="checkbox" name="hobbys" value="代码"/>代码
            <input type="checkbox" name="hobbys" value="唱歌"/>唱歌
            <input type="checkbox" name="hobbys" value="电影"/>电影
            <input type="submit" value="提交"/>
        </form>
    </div>

</div>
</body>
</html>
