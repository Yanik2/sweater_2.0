package com.example.demo.converter;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.dto.BookDto;

import java.util.ArrayList;
import java.util.List;

public class BookConverter {
    public static BookDto convert(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        List<String> tmp = new ArrayList<>();
        for(Author a : book.getAuthors()) {
            tmp.add(a.getName());
        }
        bookDto.setAuthors(tmp);
        return bookDto;
    }
}
