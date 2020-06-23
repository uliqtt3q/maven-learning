package com.learning.maven.service;

import com.learning.maven.model.Book;
import com.learning.maven.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }
}
