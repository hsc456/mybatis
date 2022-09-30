package com.example.hscdemo.controller;

import com.example.hscdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("book/{id}")
    public String GetBook(@PathVariable int id) {
        return bookService.sel(id).toString();
    }
}
