package com.snail.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * ClassName: ImageServlet
 * Package: com.snail.servlet
 * Description:
 *
 * @Date: 2023-05-26 026 23:29
 * @Author: wangkejing
 */
public class ImageServlet extends HttpServlet {
    private static final long serialVersionUID = -6442545707927163372L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //如何让浏览器5秒刷新一次
        resp.setHeader("Refresh", "3");

        //在内存中创建一个图片
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_BGR);
        //得到图片
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,80, 20);
        //给图片写数据
        graphics.setColor(Color.BLUE);
        graphics.setFont(new Font(null, Font.BOLD, 20));
        graphics.drawString(makeNum(), 0, 20);

        //告诉浏览器 这个球球用图片方式打开
        resp.setContentType("image/jpeg");
        //网站存在缓存 不让浏览器缓存
        resp.setDateHeader("exprise", -1);
        resp.setHeader("Cache-Control", "no-cache");
        resp.setHeader("Pragma", "no-cache");
        //把图片写给浏览器
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }

    public String makeNum(){
        Random random = new Random();
        String s = String.valueOf(random.nextInt(9999999));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 7 - s.length(); i++){
            sb.append("0");
        }
        s = sb.toString() + s;
        return s;
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
