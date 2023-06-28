<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--脚本片段中的代码 会被原封不动的生成到。jsp.java
要求：这里面的代码不许道正java语法的正确性
--%>
<%
    //从pagecontext取出 我们通过寻找的方式来
//  pageContext.getAttribute("name1");
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
%>

<%--使用el表达式-${}--%>
<%--${}等价<%=%> --%>

<h1>${name1}</h1>
<h1>${name2}</h1>
<h1>${name3}</h1>
<h1>${name4}</h1>

</body>
</html>
