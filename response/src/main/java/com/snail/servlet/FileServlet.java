package com.snail.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * ClassName: FileServlet
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 22:24
 * @Author: wangkejing
 */
public class FileServlet extends HttpServlet {
    private static final long serialVersionUID = 7106494378979175355L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 要获取下载文件的路径
        ServletContext context = this.getServletContext();
//        String realPath = context.getRealPath("1.png");
        String realPath = "D:\\codeing\\github\\javaweb-study\\response\\src\\main\\resources\\1.png";
        System.out.println("下载文件的路径" + realPath);
        //2. 下载的文件名是啥？
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //3. 设置想办法让浏览器能够支持下载我们需要的东西
        resp.setHeader("Content-Disposition", "attachment; filename="+ URLEncoder.encode(fileName, "UTF-8"));
        //4. 获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //5. 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        //6. 获取outputstream对象
        ServletOutputStream out = resp.getOutputStream();
        //7. 将fileoutputstream流写入到buffer缓冲区 使用outputstream将缓冲区中的数据输出到客户端
        while ((len=in.read(buffer))>0){
            out.write(buffer, 0, len);
        }

        in.close();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
