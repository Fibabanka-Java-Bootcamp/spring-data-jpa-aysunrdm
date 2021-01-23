package com.aysunerdem.services;

import com.aysunerdem.repositories.AuthorRepo;

public class AuthorService {

    private final AuthorRepo repo;

    public AuthorService(AuthorRepo repo) {this.repo = repo; }

    public void authorOperations() {}
}
