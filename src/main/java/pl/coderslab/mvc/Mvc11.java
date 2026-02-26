package pl.coderslab.mvc;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String role = "ROLE_"+request.getParameter("role").toLowerCase();
        request.setAttribute("userRole", role);
//        request.getRequestDispatcher("/mvc12").forward(request, response);
        getServletContext().getRequestDispatcher("/jsp1.jsp")
                .forward(request, response);
    }


}
 
