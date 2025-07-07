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

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>View all Books</h1>");

        BookDAO bookDAO = new BookDAOImpl();
        List<Book> books = bookDAO.view();
        if (books == null)
            out.println("No Books Found.");
        else {
            out.println("<table border>");
            out.println("<tr>");
            out.println("<th>Id</th>");
            out.println("<th>Name</th>");
            out.println("<th>Price</th>");
            out.println("</tr>");

            for (Book book : books) {
                out.println("<tr>");
                out.println("<td>"+ book.getId()+"</td>");
                out.println("<td>"+ book.getName()+"</td>");
                out.println("<td>"+ book.getPrice()+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        }

    }
}
