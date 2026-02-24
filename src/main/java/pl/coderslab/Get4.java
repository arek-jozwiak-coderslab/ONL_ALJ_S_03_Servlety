package pl.coderslab;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

/**
 * Servlet handling GET requests to /get4 endpoint.
 * Expects 'company' parameter and multiple 'learn' parameters.
 * Responds with HTML displaying company name and selected learning options.
 */
@WebServlet("/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
///get4?company=coderslab&learn=php&learn=java&learn=ruby&learn=python

        String company = request.getParameter("company");
        response.setContentType("text/html");
        response.getWriter().println("company: </br> &nbsp;&nbsp;- &nbsp;" + company);
        response.getWriter().append("</br>");

        String[] strings = request.getParameterValues("learn");
        response.getWriter().println("learn: </br>");
        for (String string : strings) {
            response.getWriter().println(" &nbsp;&nbsp;- &nbsp; " + string + "</br>");
        }
        String products[] = {
                "Asus Transformer;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };

        for (int i = 0; i < products.length; i++) {
            response.getWriter().println("<a href='/get4?i'>" + products[i] + "</a>");
        }

    }
}
 
