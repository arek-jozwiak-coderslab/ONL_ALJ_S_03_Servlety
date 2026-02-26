package pl.coderslab.mvc;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int start = Integer.parseInt(request.getParameter("start")) + 10;
        int end = Integer.parseInt(request.getParameter("end")) + 10;
        request.setAttribute("start", start);
        request.setAttribute("end", end);
        request.getRequestDispatcher("/jsp2.jsp").forward(request, response);
    }
}
 
