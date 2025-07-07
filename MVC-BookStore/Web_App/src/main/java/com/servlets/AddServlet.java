package com.servlets;

import com.bookstore.model.Book;
import com.bookstore.dao.BookDAO;
import com.bookstore.dao.BookDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        float price = Float.parseFloat(req.getParameter("price"));

        BookDAO bookDAO = new BookDAOImpl();
        int res = bookDAO.insert(new Book(0, name, price));
        out.println(res + " books inserted");
    }
}
