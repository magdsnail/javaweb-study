package com.kuang.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * ClassName: OnlineCountListeren
 * Package: com.kuang.listener
 * Description:
 *
 * @Date: 2023-06-29 029 21:15
 * @Author: wangkejing
 */

//统计网站在线人数： 统计session
public class OnlineCountListeren implements HttpSessionListener {
    //   创建session监听
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println(se.getSession().getId());

        ServletContext ctx = se.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");
//        se.getSession().invalidate();
        if (onlineCount == null) {
            onlineCount = new Integer(1);
        } else {
            int count = onlineCount.intValue();
            onlineCount = new Integer(count + 1);
        }
        ctx.setAttribute("OnlineCount", onlineCount);
    }

    //销毁session监听
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSessionListener.super.sessionDestroyed(se);
    }
}
