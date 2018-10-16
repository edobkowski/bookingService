package com.codecool.bookingSystem.repositories;

import com.codecool.bookingSystem.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findByBreakfastIsTrue();
}
