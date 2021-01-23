package com.aysunerdem.services;

import com.aysunerdem.entities.Book;
import com.aysunerdem.entities.Category;
import com.aysunerdem.repositories.CategoryRepo;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public void categoryOperations() {

        Book b1 = new Book();
        b1.setIsbn(UUID.randomUUID().toString());
        b1.setName("Spring in Action");

        Book b2 = new Book();
        b2.setIsbn(UUID.randomUUID().toString());
        b2.setName("Healthy Lifestyle");

        Book b3 = new Book();
        b3.setIsbn(UUID.randomUUID().toString());
        b3.setName("Cryptology");

        Book b4 = new Book();
        b3.setIsbn(UUID.randomUUID().toString());
        b3.setName("Black Box");

        Book b5 = new Book();
        b3.setIsbn(UUID.randomUUID().toString());
        b3.setName("Digital Castle");


        Category c1 = new Category();
        c1.setName("Computer Science");
        c1.setBooks(Collections.singletonList(b1));
        categoryRepo.save(c1);

        Category c2 = new Category();
        c2.setName("Medicine Science");
        c2.setBooks(Collections.singletonList(b2));
        categoryRepo.save(c2);

        Category c3 = new Category();
        c2.setName("Computer Science");
        c2.setBooks(Collections.singletonList(b3));
        categoryRepo.save(c3);

        Category c4 = new Category();
        c2.setName("Industrial Medicine");
        c2.setBooks(Collections.singletonList(b4));
        categoryRepo.save(c4);

        Category c5 = new Category();
        c2.setName("Science Fiction");
        c2.setBooks(Collections.singletonList(b5));
        categoryRepo.save(c5);




        System.out.println(c1);
    }
}
