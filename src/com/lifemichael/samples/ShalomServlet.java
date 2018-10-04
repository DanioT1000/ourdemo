package com.lifemichael.samples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.io.PrintWriter;

@WebServlet(name = "ShalomServlet", urlPatterns = {"a/b/c", "/servlets/shalom"})
public class ShalomServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>shalom</h1>");
        out.flush();
    }
}
