package com.msb.service.service.impl;

import com.msb.mapper.BookMapper;
import com.msb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List findAllBooks() {
        return bookMapper.seleceAllBooks();
    }
}
