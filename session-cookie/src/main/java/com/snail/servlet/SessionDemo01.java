package com.snail.servlet;

import com.snail.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * ClassName: SessionDemo01
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-06-23 023 12:27
 * @Author: wangkejing
 */
public class SessionDemo01 extends HttpServlet {
    private static final long serialVersionUID = 8451662552471162497L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到session
        HttpSession session = req.getSession();

        //给session中存东西
        session.setAttribute("name", new Person("秦疆", 18));
        String id = session.getId();
        boolean aNew = session.isNew();
        if (aNew) {
            resp.getWriter().write("session创建成功 id" + id);
        } else {
            resp.getWriter().write("session 已经存在 id" + id);
        }

        //session创建的时候做了什么事情
//        Cookie cookie = new Cookie("JSESSIONID", id);
//        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
