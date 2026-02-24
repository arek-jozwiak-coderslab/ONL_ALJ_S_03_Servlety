package pl.coderslab;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String company = request.getParameter("company");
        response.setContentType("text/html");
        response.getWriter().println("company: </br> &nbsp;&nbsp;- &nbsp;" + company);
        response.getWriter().append("</br>");
        String[] strings = request.getParameterValues("learn");
        response.getWriter().println("learn: </br>");
        for (String string : strings) {
            response.getWriter().println( " &nbsp;&nbsp;- &nbsp; "+ string + "</br>" );
        }

    }
}
 
