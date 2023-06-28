<%--
  Created by IntelliJ IDEA.
  User: wangkejing
  Date: 2023-06-28 028
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="common/header.jsp" %>
    <h1>网页主题</h1>
    <%@ include file="common/footer.jsp" %>
    <hr/>

<%--jsp标签
jsp:include 拼接页面本质还是三个
--%>
    <jsp:include page="common/header.jsp"/>

</body>
</html>
