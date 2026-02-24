package pl.coderslab;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/get2")
public class Get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String string : strings) {
            System.out.println(string);
            System.out.println(Arrays.toString(parameterMap.get(string)));
        }
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        for (String string : strings){
            writer.println("<p><b>" + string + "</b></p>");
            writer.println("<p>" + Arrays.toString(parameterMap.get(string)) + "</p>");
        }

    }


}
 
