package com.snail.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * ClassName: ServletDemo03
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 19:52
 * @Author: wangkejing
 */
public class ServletDemo03 extends HttpServlet {
    private static final long serialVersionUID = -5561835019436636219L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        String url = servletContext.getInitParameter("url");
        resp.getWriter().print(url);

        Properties properties = new Properties();



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
