package com.example.demo.controller;

import com.example.demo.converter.AuthorConverter;
import com.example.demo.converter.BookConverter;
import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookDto;
import com.example.demo.repos.AuthorRepo;
import com.example.demo.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyRestController {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private AuthorRepo authorRepo;

    @GetMapping("/getBooks")
    public List<BookDto> getBooks() {
        List<BookDto> out = new ArrayList<>();
        Iterable<Book> it = bookRepo.findAll();
        for(Book b : it) {
            out.add(BookConverter.convert(b));
        }
        return out;
    }

    @GetMapping("/getAuthors")
    public List<AuthorDto> getAuthors() {
        List<AuthorDto> out = new ArrayList<>();
        Iterable<Author> it = authorRepo.findAll();
        for(Author a : it) {
            out.add(AuthorConverter.convert(a));
        }
        return out;
    }
}
