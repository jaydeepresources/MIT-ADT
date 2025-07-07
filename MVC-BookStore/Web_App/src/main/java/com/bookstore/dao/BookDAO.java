package com.bookstore.dao;

import com.bookstore.model.Book;

import java.util.List;

public interface BookDAO {
    int insert(Book book);
    int update(Book book);
    int delete(int id);
    List<Book> view();
    Book view(int id);
    List<Book> view(String name);
}