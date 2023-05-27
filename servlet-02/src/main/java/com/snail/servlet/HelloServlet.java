package com.snail.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: HelloServlet
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 17:35
 * @Author: wangkejing
 */
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = -6644140081074101523L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.getInitParameter(); 初始化参数
//        this.getServletConfig(); servlet配置
//        this.getServletContext(); servlet上下文
        ServletContext servletContext = this.getServletContext();

        String username = "小王";
        servletContext.setAttribute("username", username);

        System.out.println("hello beibei");
    }
}
