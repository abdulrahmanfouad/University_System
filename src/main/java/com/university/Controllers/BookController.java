package com.university.Controllers;


import com.university.Entities.Book;
import com.university.Services.BookService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/Books")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/Books/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @PostMapping("/Books")
    public void addBooks(@RequestBody Book book){
        bookService.addBooks(book);
    }

    @PutMapping("/Books/{id}")
    public void updateBook(@RequestBody Book book,@PathVariable int id) throws NotFoundException {
        bookService.updateBook(book,id);
    }
    @DeleteMapping("/Books/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
    }
}
