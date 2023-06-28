<html>
<body>
<h2>Hello World!</h2>

<%--jsp表达式
作用：用来将程序的输出 输出到客户端
--%>
<%= new java.util.Date()%>

<%
    int sum = 0;
    for (int i = 0; i <= 100 ; i++) {
        sum+=i;
    }
    out.println("<h1>sum="+sum+"</h1>");
%>

<%
    int x = 10;
    out.print(x);
%>
<p>这是一个jsp文档</p>
<%
    int y = 2;
    out.print(y);
%>

<%--在代码嵌入html元素--%>
<%
    for (int i = 0; i < 5; i++) {
%>
<h1>hello  <%=i%></h1>
<%
    }
%>


</body>
</html>
