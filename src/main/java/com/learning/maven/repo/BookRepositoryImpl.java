package com.learning.maven.repo;

import com.learning.maven.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private final List<Book> books;

    {
        // executes before constructor
        books = new ArrayList<>();
        final var bookBuilder = Book.builder();
        books.add(
                bookBuilder.id(1L).name("War and Peace").author("Leo Tolstoj").build()
        );
        books.add(
                bookBuilder.id(2L).name("Crime and punnishment").author("Feodor Dostoevsky").build()
        );
    }

    @Override
    public List<Book> findAll() {
        return books;
    }
}
