package com.example.books.repository;

import com.example.books.entity.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookDetails, Integer> {
BookDetails findById(int id);
}
