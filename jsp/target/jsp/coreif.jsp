<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>if测试</h1>
<hr>

<form action="coreif.jsp" method="get">
  <%--
  el表达式获取表单中的数据
  --%>
  <input type="text" name="username" value="${param.username}"/>
  <input type="submit" value="登录"/>
</form>

</body>
</html>
