package com.learning.maven.service;

import com.learning.maven.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
