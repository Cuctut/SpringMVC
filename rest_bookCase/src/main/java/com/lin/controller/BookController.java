package com.lin.controller;

import com.lin.domain.Book;
import com.lin.domain.TestData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("[ save ] - " + book);
        return "{'module' : 'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        List<Book> books = new TestData().getBooks();
        System.out.println("[ get ] - all");
        return books;
    }
}
