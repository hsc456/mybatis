package com.bolingcavalry.simple.service;

import com.bolingcavalry.simple.entity.Book;
import com.bolingcavalry.simple.mapper.BookMapper;
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
