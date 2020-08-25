package com.edu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//证明管理
public class licenseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求的方法
        request.getRequestDispatcher("WEB-INF/view/greduateManage/gradulateLiscence.jsp").forward(request, response);
    }
}
