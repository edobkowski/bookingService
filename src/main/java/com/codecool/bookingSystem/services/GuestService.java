package com.codecool.bookingSystem.services;

import com.codecool.bookingSystem.domain.Address;
import com.codecool.bookingSystem.domain.Guest;
import com.codecool.bookingSystem.repositories.AddressRepository;
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

    public Guest createGuest(String name, String lastname, String phone, String email, String address, String city,
                             String country) {
        return guestRepository.save(new Guest(name, lastname, phone, email, address, city, country));
    }

    public Iterable<Guest> getAll() {
        return guestRepository.findAll();
    }

    public Iterable<Guest> getByFullName(String firstName, String lastName) {
        return guestRepository.findByFirstNameIgnoreCaseAndLastNameIgnoreCase(firstName, lastName);
    }

    public Iterable<Guest> getByCity(String city) {
        return guestRepository.findByCityIgnoreCase(city);
    }

    public Iterable<Guest> getByCountry(String country) {
        return guestRepository.findByCountryIgnoreCase(country);
    }

    public long total() {
        return guestRepository.count();
    }
}
