package com.example;

import org.springframework.stereotype.Component;
// For singleton Bean
@Component
public class Book {
    private String title;

    public Book(){}

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
