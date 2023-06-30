package com.kuang.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

//web启动的时候初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

//    web启动的时候
    @Override
    public void destroy() {
        Filter.super.destroy();

    }

    //chain 链
    /*
    * 1. 过滤中的所有代码在过滤特定请求的时候都会执行
    * 2. 必须要让过滤器继续执行
    */

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        System.out.println("CharacterEncodingFilter执行前。。。。");
        chain.doFilter(request, response);//让我们请求继续走 如果不写程序到这里就不走了
        System.out.println("CharacterEncodingFilter执行后。。。。");
    }
}
