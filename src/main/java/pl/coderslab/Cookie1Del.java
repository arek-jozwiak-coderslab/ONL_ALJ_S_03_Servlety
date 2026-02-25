package pl.coderslab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {
    private static final String COOKIE_NAME = "User";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean cookieIsset = false;
        Cookie[] cookies = request.getCookies();
        if(cookies == null){
            response.getWriter().append("BRAK CIASTEK");
            return;
        }
        for (Cookie cookie : cookies) {
            if(cookie.getName().equalsIgnoreCase(COOKIE_NAME)){
              cookie.setMaxAge(0);
              response.addCookie(cookie);
              cookieIsset = true;
            }
        }
        if(!cookieIsset){
            response.getWriter().append("BRAK");
        }
    }

}
 
