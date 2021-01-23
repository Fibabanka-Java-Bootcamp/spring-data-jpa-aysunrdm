package com.aysunerdem.repositories;
///
import com.aysunerdem.entities.Category;
import com.aysunerdem.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepo extends CrudRepository<Category, Integer> {

    Category findByName(String name);

    List<Category> findAllByNameContainingIgnoreCase(String name);

    List<Category> findAllByIdLessThanAndName(Integer id, String name);
}

