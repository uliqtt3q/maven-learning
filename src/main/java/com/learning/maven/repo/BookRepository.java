package com.learning.maven.repo;

import com.learning.maven.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
}
