package com.project.midterm.models;

public class Book {
    private Long id;
    private String title;
    private String author;
    private double price;
    private String description;

    // Constructors
    public Book(Long id, String title, String author, double price, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

