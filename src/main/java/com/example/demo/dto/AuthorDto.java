package com.example.demo.dto;

import java.util.List;
import java.util.Objects;

public class AuthorDto {
    private long id;
    private String name;
    private List<String> writtenBooks;

    public AuthorDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public AuthorDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(List<String> writtenBooks) {
        this.writtenBooks = writtenBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorDto authorDto = (AuthorDto) o;
        return id == authorDto.id && Objects.equals(name, authorDto.name) && Objects.equals(writtenBooks, authorDto.writtenBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, writtenBooks);
    }
}
