package com.university.Controllers;

import com.university.Entities.Book;
import javassist.NotFoundException;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    @Order(2)
    void getAllBooks() {
        List<Book> bookList = new ArrayList<>();
        bookController.getAllBooks().forEach(bookList::add);
        assertNotNull(bookList);
    }

    @Test
    @Order(3)
    void getBookById() {
        assertEquals("OOP",bookController.getBookById(201).getName());
    }

    @Test
    @Order(1)
    void addBooks() {
        Book book = new Book(303,"Software Engineering","Test Author");
        bookController.addBooks(book);
        assertEquals("Software Engineering",bookController.getBookById(303).getName());
    }

    @Test
    @Order(4)
    void updateBook() throws NotFoundException {
        Book book = new Book(408,"AI","Author 5");
        bookController.updateBook(book,408);
        assertEquals("AI",bookController.getBookById(408).getName());
    }

    @Test
    @Order(5)
    void deleteBook() {
        Book book = bookController.getBookById(101);
        bookController.deleteBook(book.getId());
        assertNull(bookController.getBookById(101));
    }
}