package com.edu.servlet.kaojiServler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class kaojiFileCheck extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //��ȡ����ķ���
        request.getRequestDispatcher("WEB-INF/kaojimanage/kaojiFileCheck.jsp").forward(request, response);
    }
}
