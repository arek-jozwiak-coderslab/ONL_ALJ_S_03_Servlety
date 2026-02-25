package pl.coderslab;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().append(
                "<form method='post'>" +
                        "  <input type='text' name='grade'/>\n" +
                        "  <button type='submit'>Submit</button>\n" +
                        "</form>"
        );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int grade = Integer.parseInt(request.getParameter("grade"));

        HttpSession session = request.getSession();
        List<Integer> grades;

        if (session.getAttribute("grades") == null) {
            grades = new ArrayList<>();
        } else {
            grades = (List<Integer>) session.getAttribute("grades");
        }
        //Integer.valueOf()

        grades.add(grade);
        session.setAttribute("grades", grades);
        response.getWriter().append("Grades added" + grades);
        double sum = 0;
        for (Integer g : grades) {
            sum += g;
        }
        double avg =sum/grades.size();
        response.getWriter().append("avg " + avg);

    }
}
 
