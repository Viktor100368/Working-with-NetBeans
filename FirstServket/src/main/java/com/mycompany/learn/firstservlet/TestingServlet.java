/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.learn.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Victor
 */
public class TestingServlet extends HttpServlet {

 
 


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       PrintWriter writer = null;
       try{
            writer=response.getWriter();
            writer.append("<html>");
            writer.append("<head><title>Hello world!!!</title></head>");
            writer.append("<body><h1>Hello Hello</h1></body>");
            writer.append("</html>");
       }finally{
           writer.close();
       }
    }      

}
