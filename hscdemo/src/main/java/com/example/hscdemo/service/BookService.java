package com.example.hscdemo.service;

import com.example.hscdemo.entity.Book;
import com.example.hscdemo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public Book sel(int id) {
        return bookMapper.sel(id);
    }
}
