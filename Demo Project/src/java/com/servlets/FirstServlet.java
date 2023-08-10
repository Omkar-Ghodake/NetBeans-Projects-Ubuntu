/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

/**
 *
 * @author omkar
 */

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet{
    ServletConfig conf;

//    @Override
//    public void init(ServletConfig sc) throws ServletException {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
//
//    @Override
//    public ServletConfig getServletConfig() {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
//
//    @Override
//    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
//
//    @Override
//    public String getServletInfo() {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
//
//    @Override
//    public void destroy() {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
    
    // Life Cycle methods
    @Override
    public void init(ServletConfig conf) throws ServletException {
        this.conf = conf;
        System.out.println("Initialising Servlet Object......");
        System.out.println("This is the config provided: " + conf);
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        System.out.println("Providing Servlet Service......");
        
        // set the content type of the response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my text from the servlet-FirstServlet</h1>");
    }
    
    @Override
    public void destroy() {
        System.out.println("Destroying Servlet Object......");
    }
    
    // Non-Life Cycle methods
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }
    
    @Override
    public String getServletInfo() {
        return "This Servlet is created by Omkar Ghodake.";
    }
}
