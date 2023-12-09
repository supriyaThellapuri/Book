package com.example.books.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class BookDto {
    @NotBlank
    private String bookCode; //A unique code assigned to each book for identification
    @NotBlank
    private String bookName; //The name or title of the book
    @NotBlank
    private String author;  //The author or authors of the book
    @NotNull
    private double price;  //The price of the book
    @NotBlank
    private String publications; //The publishing company or source of the book
    @NotBlank
    private String quantity; // The quantity or number of copies available
    @NotBlank
    private String address; //The address or location associated with the book
    @NotBlank
    private String description; //A brief description or summary of the book
    @NotNull
    @Min(value = 0, message = "Page count must be greater than or equal to 0")
    private int pageCount;  // Number of pages in the book
    @NotBlank
    private String genre;   // Genre of the book (e.g., fiction, non-fiction)
    @NotBlank
    private String language; // Language in which the book is written
    @NotBlank
    private String ISBN;     // International Standard Book Number for identification

    public BookDto(String bookCode, String bookName, String author, double price, String publications, String quantity, String address, String description, int pageCount, String genre, String language, String ISBN) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.publications = publications;
        this.quantity = quantity;
        this.address = address;
        this.description = description;
        this.pageCount = pageCount;
        this.genre = genre;
        this.language = language;
        this.ISBN = ISBN;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublications() {
        return publications;
    }

    public void setPublications(String publications) {
        this.publications = publications;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
