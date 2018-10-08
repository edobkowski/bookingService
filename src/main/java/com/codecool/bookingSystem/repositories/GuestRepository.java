package com.codecool.bookingSystem.repositories;

import com.codecool.bookingSystem.domain.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
