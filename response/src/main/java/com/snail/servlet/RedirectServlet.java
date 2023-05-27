package com.snail.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: RedirectServlet
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-27 027 10:15
 * @Author: wangkejing
 */
public class RedirectServlet extends HttpServlet {
    private static final long serialVersionUID = 7281375125586953874L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("Location", "/r/image");
//        resp.setStatus(HttpServletResponse.SC_FOUND);
        resp.sendRedirect("/r/image");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
