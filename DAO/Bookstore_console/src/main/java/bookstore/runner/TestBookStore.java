package bookstore.runner;

import bookstore.dao.BookDAO;
import bookstore.dao.BookDAOImpl;
import bookstore.model.Book;

public class TestBookStore {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();
//        TODO: Insert a new book using DAO
//        int res = bookDAO.insert(new Book(0, "Thinking in Java", 350.5f));
//        System.out.println(res + " books inserted");

//        TODO: View Books
        bookDAO.view().forEach(System.out::println);
    }
}