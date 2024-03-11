package com.project.midterm.services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service; // Import the annotation
import com.project.midterm.models.Book;

@Service // Annotate the class to define it as a Spring-managed bean
public class BookService {
    private List<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
        // Initialize your books list here if needed
    }

    public List<Book> findAll() {
        return Arrays.asList(
            new Book(1L, "Book Title 1", "Author Name 1", 29.99, "Description of the book 1"),
            new Book(2L, "Book Title 2", "Author Name 2", 49.99, "Description of the book 2")
            // Add more books here
        );
    }
}
