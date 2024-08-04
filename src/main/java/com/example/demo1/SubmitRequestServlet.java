package com.example.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/submitRequest")
public class SubmitRequestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String manager = request.getParameter("manager");
        String requestType = request.getParameter("requestType");
        String comments = request.getParameter("comments");

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Request Submitted</h1>");
        response.getWriter().println("<p>Manager: " + manager + "</p>");
        response.getWriter().println("<p>Type of Request: " + requestType + "</p>");
        response.getWriter().println("<p>Comments: " + comments + "</p>");
        response.getWriter().println("</body></html>");
    }
}