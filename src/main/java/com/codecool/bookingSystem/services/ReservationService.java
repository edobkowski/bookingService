package com.codecool.bookingSystem.services;

import com.codecool.bookingSystem.domain.Reservation;
import com.codecool.bookingSystem.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ReservationService {
    ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation createReservation() {
        return reservationRepository.save(new Reservation());
    }

    public Iterable<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    public long total() {
        return reservationRepository.count();
    }
}
