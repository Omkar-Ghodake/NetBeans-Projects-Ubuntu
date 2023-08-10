package com.practice;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author omkar
 */
public class RegisterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher navDis = req.getRequestDispatcher("navbar");
        navDis.include(req, res);
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h1>Welcome to Register Servlet</h1>");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String cond = req.getParameter("cond");

        if (cond != null && cond.equals("on")) {
            out.println("<h3>Name: " + name + "</h3>");
            out.println("<h3>Email: " + email + "</h3>");
            out.println("<h3>Password: " + password + "</h3>");
            
            RequestDispatcher rd = req.getRequestDispatcher("success");
            rd.forward(req, res);
        } else {
            out.println("<h3>You did not agreed to terms and conditions...</h3>");
            
            // include output of index.html
            
            // get the object of request dispatcher
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            
            // include method
            rd.include(req, res);
        } 
   }
}
