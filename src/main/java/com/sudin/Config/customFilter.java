package com.sudin.Config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.Principal;

/**
 * Created by Sudin Ranjitkar on 5/16/2017.
 */
public class customFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init called");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter called");
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        Principal userPrincipal = request.getUserPrincipal();
        System.out.println("userPrincipal " +userPrincipal);
    }

    @Override
    public void destroy() {
        System.out.println("destroy called");
    }
}
