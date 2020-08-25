package com.edu.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//�ַ���������� ������һ��servlet
public class EncodingFilter implements Filter {


    @Override
    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) rep;
        //���ñ����ʽ
        request.setCharacterEncoding("UTF-8");
        //���÷�������
        response.setContentType("text/html; charset=utf-8");
        //������Դ
        chain.doFilter(request,response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
