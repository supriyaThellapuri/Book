package com.example.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookTable")
public class BookDetails {
    @Id
    @GeneratedValue
    private int id; //A unique identifier for each book. Auto-generated by the database
    private String bookCode; //A unique code assigned to each book for identification
    private String bookName; //The name or title of the book
    private String author;  //The author or authors of the book
    private double price;  //The price of the book
    private String publications; //The publishing company or source of the book
    private String quantity; // The quantity or number of copies available
    private String address; //The address or location associated with the book
    private String description; //A brief description or summary of the book

    private int pageCount;  // Number of pages in the book

    private String genre;   // Genre of the book (e.g., fiction, non-fiction)

    private String language; // Language in which the book is written

    private String ISBN;     // International Standard Book Number for identification

    public BookDetails(int id, String bookCode, String bookName, String author, double price, String publications, String quantity, String address, String description, int pageCount, String genre, String language, String ISBN, boolean available) {
        this.id = id;
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
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private boolean available; // Indicates whether the book is currently available

    public BookDetails()
    {

    }

}

