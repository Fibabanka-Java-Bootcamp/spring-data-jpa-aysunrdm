package com.aysunerdem.repositories;

import com.aysunerdem.entities.Order_book;
import com.aysunerdem.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface OrderBookRepo extends CrudRepository<Order_book, Integer> {

    Order_book findByName(String book_isbn);

    List<Order_book> findAllByNameContainingIgnoreCase(String book_isbn);

    List<Order_book> findAllByIdLessThanAndName(Integer order_id, String book_isbn);
}
