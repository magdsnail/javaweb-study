package com.snail.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: RequestTestServlet
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-27 027 13:17
 * @Author: wangkejing
 */
public class RequestTestServlet extends HttpServlet {
    private static final long serialVersionUID = 2447768248688289768L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理请求
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + password);

        // 重定向时候一定要注意 路径问题 否则404
        resp.sendRedirect("/r/success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
