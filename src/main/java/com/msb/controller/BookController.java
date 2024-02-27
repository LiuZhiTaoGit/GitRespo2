package com.msb.controller;

import com.msb.pojo.Book;
import com.msb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/findBook")
    @ResponseBody
    public String findBook(){
        List list = bookService.findAllBooks();
        String Books = "";
        for (int i = 0; i < list.size(); i++) {
            Book book = (Book) list.get(i);
            Books = Books + book.getName();
            Books = Books + book.getAuthor();
        }
        return Books;

    }

}
