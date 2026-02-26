//package pl.coderslab.filters;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.util.UUID;
//
//@WebServlet("/admin/logout")
//public class Logout extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        UUID uuid = UUID.randomUUID();
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getSession().invalidate(); //czyszcze sesje i usuwam klucz JSESSIONID dla usera
//        response.sendRedirect("/login"); // przesylam usera do adresu /login
//    }
//}
