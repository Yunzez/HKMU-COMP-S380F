package com.midterm.project.viewControllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.midterm.project.models.Book;

@Controller
public class HomeViewController {

    @GetMapping("/")
    public String greeting(Model model) {
        List<Book> books = Arrays.asList(
                new Book(1L, "Book Title 1", "Author 1", 19.99, "Description 1"),
                new Book(2L, "Book Title 2", "Author 2", 29.99, "Description 2"),
                new Book(3L, "Book Title 1", "Author Name 1", 29.99, "Description of the book 1")
        // Add more books as needed
        );
        System.out.println("Number of books: " + books.size());
        // books.forEach(book -> System.out.println(book.getTitle()));


        model.addAttribute("books", books);
        model.addAttribute("message", "Hello, Spring MVC and JSP!");
        return "home"; // Returns the view name
    }

}
