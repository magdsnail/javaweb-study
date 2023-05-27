package com.snail.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesServlet
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 21:12
 * @Author: wangkejing
 */
public class PropertiesServlet extends HttpServlet {
    private static final long serialVersionUID = 3242208006154729232L;

    public void test() {
        Properties properties = new Properties();
//        properties.load();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
