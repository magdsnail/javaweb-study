<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  ArrayList<String> people = new ArrayList<>();
  people.add(0, "张三");
  people.add(1, "李四");
  people.add(2, "王五");
  people.add(3, "赵六");
  people.add(4, "麻子");
  request.setAttribute("list", people);
%>

<%--
var 每一次遍历出的变量
items 要遍历的对象
begin default 0
end
step default 1
--%>
<c:forEach var="people" items="${list}">
  <c:out value="${people}"/><br/>
</c:forEach>

<c:forEach var="people" items="${list}" begin="1" end="3" step="2">
  <c:out value="${people}"/> <br/>
</c:forEach>

</body>
</html>
