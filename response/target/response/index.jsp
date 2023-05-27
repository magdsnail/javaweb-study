<html>
<body>
<h2>Hello World!</h2>
<%--这里提交的路径需要寻找到项目的路径--%>
<%--${pageContext.request.contextPath} 代表当前项目--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    <label>用户名</label>
    <input type="text" name="username"/>
    <label>密码</label>
    <input type="password" name="password"/>
    <input type="submit"/>
</form>
</body>
</html>
