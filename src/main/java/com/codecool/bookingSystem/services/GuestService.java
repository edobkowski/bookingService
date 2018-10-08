package com.codecool.bookingSystem.services;

import com.codecool.bookingSystem.domain.Address;
import com.codecool.bookingSystem.domain.Guest;
import com.codecool.bookingSystem.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService {

    private GuestRepository guestRepository;

    @Autowired
    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public Guest createGuest(String name, String lastname, String phone, String email, Address address) {
        guestRepository.save(new Guest(name, lastname, phone, email, address));
        return null;
    }

    public Iterable<Guest> getAll() {
        return guestRepository.findAll();
    }

    public long total() {
        return guestRepository.count();
    }
}
