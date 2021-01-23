package com.aysunerdem.services;

import com.aysunerdem.repositories.BookRepo;

public class BookService {

    private final BookRepo repo;

    public BookService(BookRepo repo) { this.repo = repo;  }

    public void bookOperations() {}
}
