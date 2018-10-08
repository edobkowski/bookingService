package com.codecool.bookingSystem.repositories;

import com.codecool.bookingSystem.domain.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
