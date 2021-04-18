package com.example.demo.dto;

import java.util.List;
import java.util.Objects;

public class BookDto {
    private long id;
    private String title;
    private List<String> authors;

    public BookDto(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public BookDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, authors);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null) return false;
        if(!(obj instanceof BookDto)) return false;
        BookDto book = (BookDto) obj;
        return id == book.getId() && title.equals(book.getTitle());
    }
}
