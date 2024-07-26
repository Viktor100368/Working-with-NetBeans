/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.learn.firstservlet;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ImageServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("image/bmp");
            OutputStream out = response.getOutputStream();
     //       PrintWriter writer = response.getWriter();
       //     writer.write("<h1>hello</h1>");
            try{
                URL imageURL = ImageServlet.class.getResource("C:\\Users\\Victor\\Documents\\picture\\bear.bmp");
                //URL imageURL = ImageServlet.class.getResource("bear.png");
                BufferedImage bi = ImageIO.read(imageURL);
                ImageIO.setUseCache(false);
                ImageIO.write(bi,"png",out);
            }finally{
                out.close();
            }
         //   writer.write("<br><h1>Dolly</h1>");
    }


}
