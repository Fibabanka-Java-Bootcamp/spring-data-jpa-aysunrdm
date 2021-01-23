package com.aysunerdem.services;

import com.aysunerdem.repositories.OrderBookRepo;

public class OrderBookService {

    private final OrderBookRepo repo;

    public OrderBookService(OrderBookRepo repo) {  this.repo = repo;  }

    public void orderBookOperations() {}
}
