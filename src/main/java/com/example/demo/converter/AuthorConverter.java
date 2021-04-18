package com.example.demo.converter;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.dto.AuthorDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorConverter {
    public static AuthorDto convert(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());
        List<String> tmp = new ArrayList<>();
        for(Book b : author.getWrittenBooks()) {
            tmp.add(b.getTitle());
        }
        authorDto.setWrittenBooks(tmp);
        return authorDto;
    }
}
