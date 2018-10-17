package com.codecool.bookingSystem.controllers;

import com.codecool.bookingSystem.domain.Room;
import com.codecool.bookingSystem.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/rooms")
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createRoom(@RequestBody Room room) {
        this.roomService.createRoom(room);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Room> getAll() {
        return this.roomService.getAll();
    }

    @RequestMapping(params = "{name}", method = RequestMethod.GET)
    public Room getByName(@RequestParam(value = "name") String name) {
        return this.roomService.getByName(name);
    }
}
