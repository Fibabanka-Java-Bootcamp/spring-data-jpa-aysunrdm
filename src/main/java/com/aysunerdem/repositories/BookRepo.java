package com.aysunerdem.repositories;

import com.aysunerdem.entities.Book;
import com.aysunerdem.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Integer> {

    Book findByName(String name);

    List<Book> findAllByNameContainingIgnoreCase(String name);

    List<Book> findAllByIdLessThanAndName(Integer category_id, String name);
}
