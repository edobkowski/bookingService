package com.codecool.bookingSystem.controllers;

import com.codecool.bookingSystem.domain.Guest;
import com.codecool.bookingSystem.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/guests")
public class GuestController {

    private GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createGuest(@RequestBody Guest guest) {
        this.guestService.createGuest(guest.getFirstName(), guest.getLastName(), guest.getPhone(), guest.getEmail(),
                guest.getAddress(), guest.getCity(), guest.getCountry());
    }

    @RequestMapping(method = RequestMethod.GET)
    Iterable<Guest> getAll() {
        return this.guestService.getAll();
    }

    @RequestMapping(params = {"firstName", "lastName"}, method = RequestMethod.GET)
    public Iterable<Guest> getByFullName(@RequestParam(value = "firstName") String firstName, @RequestParam(value =
            "lastName") String lastName) {
        return this.guestService.getByFullName(firstName, lastName);
    }

    @RequestMapping(params = {"city"}, method = RequestMethod.GET)
    public Iterable<Guest> getByCity(@RequestParam(value = "city") String city) {
        return this.guestService.getByCity(city);
    }

    @RequestMapping(params = {"country"}, method = RequestMethod.GET)
    public Iterable<Guest> getByCountry(@RequestParam(value = "country") String country) {
        return this.guestService.getByCountry(country);
    }
}
