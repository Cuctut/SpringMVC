package com.lin.service;

import com.lin.config.SpringConfig;
import com.lin.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(3);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> books = bookService.getAll();
        for ( Book book : books
             ) {
            System.out.println(book);
        }
    }

}
