package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: ShowServlet
 * Package: com.kuang.servlet
 * Description:
 *
 * @Date: 2023-06-29 029 16:17
 * @Author: wangkejing
 */
public class ShowServlet extends HttpServlet {
    private static final long serialVersionUID = -435239970249127236L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("你好");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
