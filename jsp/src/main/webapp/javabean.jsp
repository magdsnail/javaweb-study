<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="people" class="com.kuang.pojo.People" scope="page"/>
<jsp:setProperty name="people" property="name" value="kuangshen"/>
<jsp:setProperty name="people" property="address" value="xian"/>
<jsp:setProperty name="people" property="age" value="12"/>


age: <jsp:getProperty name="people" property="age"/>
</body>
</html>
