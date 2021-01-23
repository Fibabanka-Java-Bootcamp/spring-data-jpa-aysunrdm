package com.aysunerdem.repositories;

import com.aysunerdem.entities.Order;
import com.aysunerdem.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepo extends CrudRepository<Order, Integer> {

}
