package com.aysunerdem.services;

import com.aysunerdem.entities.Address;
import com.aysunerdem.repositories.AddressRepo;

public class AddressService {

    private final AddressRepo repo;

    public AddressService(AddressRepo repo) { this.repo = repo; }
    public void addressOperations() {

        Address a = new Address();
        a.setName("address");
    }



}
