package com.aysunerdem.repositories;

import com.aysunerdem.entities.Author;
import com.aysunerdem.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepo extends CrudRepository<Author, Integer> {

    Author findByName(String name);

    List<Author> findAllByNameContainingIgnoreCase(String name);

    List<Author> findAllByIdLessThanAndName(Integer id, String name);
}
