package com.codecool.bookingSystem.repositories;

import com.codecool.bookingSystem.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
