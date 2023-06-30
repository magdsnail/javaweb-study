package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: LogoutServlet
 * Package: com.kuang.servlet
 * Description:
 *
 * @Date: 2023-06-30 030 12:18
 * @Author: wangkejing
 */
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1618205493337382778L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object userSession = req.getSession().getAttribute("USER_SESSION");
        if(userSession != null){
            req.getSession().removeAttribute("USER_SESSION");
            resp.sendRedirect("/Login.jsp");
        }else {
            resp.sendRedirect("/Login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
