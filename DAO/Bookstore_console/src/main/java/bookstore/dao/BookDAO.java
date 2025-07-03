package bookstore.dao;

import bookstore.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    int insert(Book book);
    int update(Book book);
    int delete(int id);
    List<Book> view();
    Book view(int id);
    List<Book> view(String name);
}