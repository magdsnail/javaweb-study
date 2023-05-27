package com.snail.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: GetServlet
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 19:34
 * @Author: wangkejing
 */
public class GetServlet extends HttpServlet {
    private static final long serialVersionUID = -2381460883693094848L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();

        String username = (String) servletContext.getAttribute("username");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().print("名字" + username);
    }
}
