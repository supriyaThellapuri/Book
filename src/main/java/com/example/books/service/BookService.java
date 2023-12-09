package com.example.books.service;

import com.example.books.dto.BookDto;
import com.example.books.entity.BookDetails;
import com.example.books.exception.BookNotFoundException;
import com.example.books.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookRepo repo;

    public BookDetails display(BookDto request) {
        BookDetails b = new BookDetails();
        b.setId(0);
        b.setBookCode(request.getBookCode());
        b.setBookName(request.getBookName());
        b.setAuthor(request.getAuthor());
        b.setPrice(request.getPrice());
        b.setPublications(request.getPublications());
        b.setQuantity(request.getQuantity());
        b.setAddress(request.getAddress());
        b.setDescription(request.getDescription());
        b.setPageCount(request.getPageCount());
        b.setGenre(request.getGenre());
        b.setLanguage(request.getLanguage());
        b.setISBN(request.getISBN());
        return repo.save(b);
    }

    public List<BookDetails> getAllBooks() {

        return repo.findAll();
    }

    public BookDetails getBookById(int id) throws BookNotFoundException {
        BookDetails book = repo.findById(id);
        if (book != null) {
            return book;
        } else {
            throw new BookNotFoundException("Book details not found with this id");
        }

    }

    public String deleteBookById(int id) {
        repo.deleteById(id);
        return "Book Information deleted with id:"+id;
    }

    public void createManyBooks(List<BookDto> bookDtoList) {
        for (BookDto bookDto : bookDtoList) {
            display(bookDto);
        }
    }

    public BookDetails updateBookById(int id, BookDto request) throws BookNotFoundException {
        BookDetails existingBook = repo.findById(id);

        if (existingBook != null) {
            // Update the fields with the new values
            existingBook.setBookCode(request.getBookCode());
            existingBook.setBookName(request.getBookName());
            existingBook.setAuthor(request.getAuthor());
            existingBook.setPrice(request.getPrice());
            existingBook.setPublications(request.getPublications());
            existingBook.setQuantity(request.getQuantity());
            existingBook.setAddress(request.getAddress());
            existingBook.setDescription(request.getDescription());

            // Save the updated book to the repository
            return repo.save(existingBook);
        } else {
            throw new BookNotFoundException("Book not found with id: " + id);
        }
    }
}
