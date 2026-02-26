package pl.coderslab.workshop;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/sample-panel")
public class AdminPanelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> users =  List.of(new User(1L,"John Doe", "john@example.com", "password123"),
                new User(2L,"Jane Smith", "jane@example.com", "securepass"),
                new User(3L,"Alice Johnson", "alice@example.com", "pass1234"),
                new User(4L,"Bob Brown", "bob@example.com", "secretpass"),
                new User(5L,"Charlie Green", "charlie@example.com", "secure123"),
                new User(6L,"David White", "david@example.com", "pass1234")

        );
        request.setAttribute("users", users);

        request.getRequestDispatcher("/workshop/index.jsp").forward(request, response);
    }

}
 
