package com.example.books.exception;

public class BookNotFoundException extends Exception{

    public BookNotFoundException(String message)
    {
        super(message);
    }
}
