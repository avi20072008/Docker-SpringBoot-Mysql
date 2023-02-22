package com.example.dockermysqlexample.controller;

import com.example.dockermysqlexample.model.Book;
import com.example.dockermysqlexample.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @PostMapping
    public void createBook(@RequestBody Book book){
        bookRepository.save(book);
    }

}
