package pl.coderslab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/showCookie")
public class Cookie1Get extends HttpServlet {
    private static final String COOKIE_NAME = "User";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equalsIgnoreCase(COOKIE_NAME)){
                response.getWriter().append(cookie.getValue());
            }
        }
    }

}
 
