package com.snail.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: ServletDemo05
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 21:23
 * @Author: wangkejing
 */
public class ServletDemo05 extends HttpServlet {
    private static final long serialVersionUID = -6200868532868912571L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream resourceAsStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        Properties prop = new Properties();
        prop.load(resourceAsStream);

        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        resp.getWriter().print(username + "===" + password);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
