package com.servlets;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author omkar
 */
public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This Servlet is created by extending GenericServlet class.");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This Servlet is created by extending GenericServlet class.</h1>");
    }
}
