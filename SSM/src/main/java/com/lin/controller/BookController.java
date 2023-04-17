package com.lin.controller;

import com.lin.domain.Book;
import com.lin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean isSaved = bookService.save(book);
        return new Result(isSaved, isSaved? Code.SAVE_OK : Code.SAVE_ERR);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean isUpdate = bookService.update(book);
        return new Result(isUpdate, isUpdate? Code.UPDATE_OK : Code.UPDATE_ERR);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean isDelete = bookService.delete(id);
        return new Result(isDelete, isDelete? Code.DELETE_OK : Code.DELETE_ERR);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book!=null? Code.GET_OK : Code.GET_ERR;
        String msg = book!=null? "" : "查询失败";
        return new Result(book, code, msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = books!=null? Code.GET_OK : Code.GET_ERR;
        String msg = books!=null? "" : "查询失败";
        return new Result(books, code, msg);
    }

}
