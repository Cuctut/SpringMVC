package com.lin.domain;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    List<Book> books = new ArrayList<>();

    public TestData() {
        Book b1 = new Book();
        b1.setName("《如何练习两年半》");
        b1.setType("sport");
        b1.setId(25);
        b1.setDescription("让你鹤立鸡群");

        Book b2 = new Book();
        b2.setName("《尼古丁真派 vs 芙蓉王源派》");
        b2.setType("history");
        b2.setId(10);
        b2.setDescription("维新派与守旧派的世纪之战");

        books.add(b1);
        books.add(b2);
    }

    public List<Book> getBooks() {
        return books;
    }
}
