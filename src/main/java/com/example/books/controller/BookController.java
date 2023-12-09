package com.example.books.controller;

import com.example.books.dto.BookDto;
import com.example.books.entity.BookDetails;
import com.example.books.exception.BookNotFoundException;
import com.example.books.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping("/create")
    public ResponseEntity<BookDetails> display(@RequestBody @Valid BookDto request)
    {
        return new ResponseEntity<>(service.display(request), HttpStatus.CREATED);
    }
    @PostMapping("/createMany")
    public ResponseEntity<String> createManyBooks(@RequestBody @Valid List<BookDto> requestList) {
        service.createManyBooks(requestList);
        return new ResponseEntity<>("List of books created successfully", HttpStatus.CREATED);
    }
    @GetMapping("/fetchall")
    public ResponseEntity<List<BookDetails>> getAllBooks()
    {
        return ResponseEntity.ok(service.getAllBooks());
    }
    @GetMapping("/{id}")
    public ResponseEntity<BookDetails> getBookById(@PathVariable int id) throws BookNotFoundException
    {
        return ResponseEntity.ok(service.getBookById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBookDetailsById(@PathVariable int id) {
        service.deleteBookById(id);
        return ResponseEntity.ok(service.deleteBookById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<BookDetails> updateBookDetails(@PathVariable int id, @RequestBody @Valid BookDto request) throws BookNotFoundException {
        BookDetails updatedBook = service.updateBookById(id, request);
        return ResponseEntity.ok(updatedBook);
    }



}