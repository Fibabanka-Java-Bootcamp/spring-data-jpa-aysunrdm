package com.aysunerdem.repositories;
///
import com.aysunerdem.entities.Address;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AddressRepo extends CrudRepository<Address, Integer> {

    Address findByName(String street);

    List<Address> findAllByNameContainingIgnoreCase(String street);

    List<Address> findAllByIdLessThanAndName(Integer id, String street);
}
