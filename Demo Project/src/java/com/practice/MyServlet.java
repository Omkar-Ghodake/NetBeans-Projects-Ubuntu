package com.practice;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author omkar
 */

public class MyServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("This is Get method of MyServlet......");
        
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        out.println("<h1>This is Get method of MyServlet.</h1>");
    }
}
