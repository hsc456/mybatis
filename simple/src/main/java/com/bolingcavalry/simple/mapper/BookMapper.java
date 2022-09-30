package com.bolingcavalry.simple.mapper;

import com.bolingcavalry.simple.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    Book sel(int id);
}
