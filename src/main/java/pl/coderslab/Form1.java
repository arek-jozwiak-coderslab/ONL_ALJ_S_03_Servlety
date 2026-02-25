package pl.coderslab;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/post1")
public class Form1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("firstName: " + request.getParameter("firstName"));
        response.getWriter().println("lastName: " + request.getParameter("lastName"));
        response.getWriter().println("pass: " + request.getParameter("pass"));

    }
}
 
