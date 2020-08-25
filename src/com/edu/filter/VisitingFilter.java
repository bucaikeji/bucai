package com.edu.filter;


import com.lizhou.bean.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;

public class VisitingFilter implements Filter {


    @Override
    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) rep;

        User user =(User)request.getSession().getAttribute("user");

        String contextPath = request.getContextPath();

        String uri = request.getContextPath();
        //��������д����ó����������ַ
        uri = uri.substring(uri.lastIndexOf("/")+1,uri.length());

        if(user!=null){
            filterChain.doFilter(request,response);
        }else{
            //���ݲ����ϣ�ת����indexҳ��
            response.sendRedirect(contextPath+"/index.jsp");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
