package com.codecool.bookingSystem.repositories;

import com.codecool.bookingSystem.domain.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
    Guest getByEmailIgnoreCase(String email);
    Iterable<Guest> findByCityIgnoreCase(String city);
    Iterable<Guest> findByCountryIgnoreCase(String country);
    Iterable<Guest> findByFirstNameIgnoreCaseAndLastNameIgnoreCase(String firstName, String lastName);
}