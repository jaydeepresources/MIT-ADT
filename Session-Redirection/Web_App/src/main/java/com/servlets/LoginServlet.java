package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession(true);

//        TODO: Login-> Save user in session

        if(username == null && password == null){
            resp.sendRedirect("http://localhost:8080/Web_App/index.html");
        }

        if (!username.isBlank()) {
            session.setAttribute("user", username);
            req.getRequestDispatcher("/home").forward(req, resp);
        }

    }
}
