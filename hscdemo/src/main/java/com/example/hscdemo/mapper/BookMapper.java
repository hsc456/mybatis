package com.example.hscdemo.mapper;


import com.example.hscdemo.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    Book sel(int id);
}
