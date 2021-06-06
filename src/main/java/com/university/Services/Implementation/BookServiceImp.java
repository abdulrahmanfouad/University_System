package com.university.Services.Implementation;

import com.university.Entities.Book;
import com.university.Repositories.BookRepository;
import com.university.Services.BookService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private final BookRepository bookRepository;

    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBooks(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(bookList::add);
        return bookList;
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book getBookByCourseId(String courseID) {
        return bookRepository.findByCourseId(courseID);
    }

    @Override
    public void updateBook(Book book, int id) throws NotFoundException {
        Book book1 = bookRepository.getOne(id);
        book1.setName(book.getName());
        book1.setAuthor(book.getAuthor());
        bookRepository.save(book1);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
