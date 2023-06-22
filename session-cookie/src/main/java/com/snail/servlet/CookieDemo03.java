package com.snail.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * ClassName: CookieDemo03
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-06-23 023 00:59
 * @Author: wangkejing
 */

//中文数据传递
public class CookieDemo03 extends HttpServlet {
    private static final long serialVersionUID = 2390161796444358447L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
//        URLDecoder.decode();
//        URLEncoder.encode()
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
