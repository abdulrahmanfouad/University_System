package com.university.Entities;

import java.time.LocalDate;

public class Book {

    private Integer id;
    private String name;
    private LocalDate createdAt;

    public Book() {
    }

    public Book(Integer id, String name, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public Book(String name, LocalDate createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
