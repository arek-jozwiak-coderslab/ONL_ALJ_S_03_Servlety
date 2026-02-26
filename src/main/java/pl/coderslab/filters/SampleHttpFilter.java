//package pl.coderslab.filters;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpFilter;
//
//import java.io.IOException;
//
//@WebFilter("/*")
//public class SampleHttpFilter extends HttpFilter {
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response,
//                         FilterChain chain)
//            throws ServletException, IOException {
//
//        System.out.println("FILTER 2");
//        chain.doFilter(request, response);
//    }
//}