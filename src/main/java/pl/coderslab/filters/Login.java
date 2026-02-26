//package pl.coderslab.filters;
//
//import jakarta.servlet.*;
//import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;
//
//import java.io.IOException;
//
//@WebServlet("/login")
//public class Login extends HttpServlet {
//    private final static String USER = "admin";
//    private final static String PASSWORD = "coderslab";
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String user = request.getParameter("username");
//        String pass = request.getParameter("password");
//        if (user.equals(USER) && pass.equals(PASSWORD)) { // porownuje dane z formularza ze STALYMI
//            // dodaj dane do sesji pod kluczem: username
//            request.getSession().setAttribute("username", USER);
//            // przekieruj na adres /admin
//            response.sendRedirect("/admin");
//        } else {
//            // wyświetl informacje o błędnych danych
//            response.sendRedirect("/login?msg=bad_credential");
//        }
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if (request.getParameter("msg") != null) {
//            if (request.getParameter("msg").equals("bad_credential")) {
//                request.setAttribute("message", "Twoje dane do logowania są niepoprawne");
//            } else if (request.getParameter("msg").equals("error")) {
//                request.setAttribute("message", "Nie masz uprawnień do strefy chronionej");
//
//            }
//        }
//        request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
//    }
//}