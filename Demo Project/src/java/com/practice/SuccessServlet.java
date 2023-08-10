package com.practice;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.PrintWriter;

/**
 *
 * @author omkar
 */
public class SuccessServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher navDis = req.getRequestDispatcher("navbar");
        navDis.include(req, res);
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>This is Success Servlet.</h2>");
        out.println("<h3>Successfully Registered!</h3>");
        
        
    }
    
}
