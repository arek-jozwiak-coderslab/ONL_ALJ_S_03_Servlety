package pl.coderslab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/post2")
public class Form2 extends HttpServlet {

    private String getStars(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String content = request.getParameter("content");
        String confirm = request.getParameter("confirm");

        List<String> badWords = List.of("cholera", "dupa","cholera,");


        if (confirm != null) {
            response.getWriter().println("content: " + content);
        } else {
            String newContent = "";
            String[] split = content.split(" ");
            for (String s : split) {
                if (badWords.contains(s)) {
                    newContent += getStars(s.length());
                } else {
                    newContent += s;
                }
                newContent += " ";
            }
            response.getWriter().println("content: " + newContent);
        }
    }
}
 
