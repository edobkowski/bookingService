package com.codecool.bookingSystem.services;

import com.codecool.bookingSystem.domain.Room;
import com.codecool.bookingSystem.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Iterable<Room> getAll() {
        return this.roomRepository.findAll();
    }

    public Room getByName(String name) {
        return this.roomRepository.findByNameIgnoreCase(name);
    }

    public void createRoom(Room room) {
        this.roomRepository.save(room);
    }

    public long total() {
        return this.roomRepository.count();
    }
}
