package com.snail.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ServletDemo04
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 21:01
 * @Author: wangkejing
 */
public class ServletDemo04 extends HttpServlet {
    private static final long serialVersionUID = -2710547268178837947L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        servletContext.getRequestDispatcher("/gp").forward(req, resp);//调用forward实现转发
    }
}
