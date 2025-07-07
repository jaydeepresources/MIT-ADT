package com.servlets;

import com.bookstore.dao.BookDAO;
import com.bookstore.dao.BookDAOImpl;
import com.bookstore.model.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/book")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO bookDAO = new BookDAOImpl();
        String msg = "";
        int res = -1;
        String operation = req.getParameter("operation");
        switch (operation) {
            case "add":
                res = bookDAO.insert(new Book(0, req.getParameter("name"), Float.parseFloat(req.getParameter("price"))));
                msg = res + " rows inserted.";
                req.setAttribute("msg", msg);
                req.getRequestDispatcher("result.jsp").forward(req, resp);
                break;

            case "delete":
                res = bookDAO.delete(Integer.parseInt(req.getParameter("id")));
                msg = res + " rows deleted.";
                req.setAttribute("msg", msg);
                req.getRequestDispatcher("result.jsp").forward(req, resp);
                break;

            case "view":
                List<Book> books = bookDAO.view();
                req.setAttribute("books", books);
                req.getRequestDispatcher("view.jsp").forward(req, resp);
                break;
        }
    }
}
