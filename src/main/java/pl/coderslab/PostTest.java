package pl.coderslab;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Arrays;

@WebServlet("/test-post")
public class PostTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] colors = request.getParameterValues("colors");
        response.getWriter().println("colors: </br>" + Arrays.toString(colors));
        String payment = request.getParameter("payment");
        response.getWriter().println("payment: </br>" + payment);

    }
}
 
