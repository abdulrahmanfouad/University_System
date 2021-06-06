package com.university.Controllers;


import com.university.Entities.Book;
import com.university.Services.BookService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/Books")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/Book/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @GetMapping("/Book/{name}")
    public Book getBookByName(@PathVariable String name){
        return bookService.getBookByName(name);
    }
    @PostMapping("/Books")
    public void addBooks(@RequestBody Book book){
        bookService.addBooks(book);
    }
    @PutMapping("/Books/{id}")
    public void updateStudent(@RequestBody Book book,@PathVariable int id) throws NotFoundException {
        bookService.updateBook(book,id);
    }
    @DeleteMapping("/Books/{id}")
    public void deleteStudent(@PathVariable int id){
        bookService.deleteBook(id);
    }
}
