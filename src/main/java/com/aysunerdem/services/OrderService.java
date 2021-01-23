package com.aysunerdem.services;

import com.aysunerdem.repositories.OrderRepo;

public class OrderService {

    private final OrderRepo repo;

    public OrderService(OrderRepo repo) { this.repo = repo;  }

    public void orderOperations() {}
}
