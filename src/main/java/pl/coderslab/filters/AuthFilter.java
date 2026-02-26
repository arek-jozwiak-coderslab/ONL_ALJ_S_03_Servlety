package pl.coderslab.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;

@WebFilter("/admin/*") //ustawiam dla filtra mapowanie (wszystkie adresy z prefixem /admin)
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpSession httpSession = request.getSession(); //pobieram sesje

        if (httpSession.getAttribute("username") == null) { //sprawdzam czy w sesji istnieje username (zeby sprawdzic czy user jest zalogowany)
            response.sendRedirect("/login?msg=error"); // jesli nie jestem zalogowany to robimy redirect
        } else {
            filterChain.doFilter(servletRequest, servletResponse); // jesli zalogowany to dopiero wtedy robimy przekazanie do potencjalnych
            // innych filtrow lub do servletu
        }
    }

}
