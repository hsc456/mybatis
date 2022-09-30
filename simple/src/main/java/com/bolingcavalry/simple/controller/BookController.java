package com.bolingcavalry.simple.controller;

import com.bolingcavalry.simple.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Huangsc 2022.09.30
测试一下
* */
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("book/{id}")
    public String GetBook(@PathVariable int id) {
        return bookService.sel(id).toString();
    }
}
