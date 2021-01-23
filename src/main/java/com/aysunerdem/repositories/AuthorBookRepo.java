package com.aysunerdem.repositories;

import com.aysunerdem.entities.Author_book;
import com.aysunerdem.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorBookRepo extends CrudRepository<Author_book, Integer> {

    Author_book findByName(String book_isbn);

    List<Author_book> findAllByNameContainingIgnoreCase(String book_isbn);

    List<Author_book> findAllByIdLessThanAndName(Integer author_id, String book_isbn);

}
