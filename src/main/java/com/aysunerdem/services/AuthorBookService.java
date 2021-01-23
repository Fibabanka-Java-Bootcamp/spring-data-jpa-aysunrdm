package com.aysunerdem.services;

import com.aysunerdem.repositories.AuthorBookRepo;

public class AuthorBookService {

    private final AuthorBookRepo repo;

    public AuthorBookService(AuthorBookRepo repo) {
        this.repo = repo;
    }

    public void authorBookOperations() {
    }
}