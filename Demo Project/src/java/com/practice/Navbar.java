package com.practice;

import jakarta.servlet.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author omkar
 */
public class Navbar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        
        out.println("<ul><li><a href=\"/Demo_Project\">Home</a></li><li><a href=\"/Demo_Project/index.html\">Index</a></li><li><a href=\"web1\">First Servlet</a></li><li><a href=\"web2\">Second Servlet</a></li><li><a href=\"web3\">My Servlet</a></li></ul>");
    }
    
}
