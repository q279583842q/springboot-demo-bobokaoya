package com.dpb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 通过urlPatterns指定映射地址或者在web.xml文件中配置
 */
@WebServlet(name = "helloServlet",urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hello serlvet");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
