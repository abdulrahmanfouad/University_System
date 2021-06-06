package com.university.Services;

import com.university.Entities.Book;

import javassist.NotFoundException;

import java.util.List;

public interface BookService {
    void addBooks(Book book);
    List<Book> getBooks();
    Book getBookById(int id);
    Book getBookByCourseId(String courseId);
    void updateBook(Book book, int id) throws NotFoundException;
    void deleteBook(int id);
}
