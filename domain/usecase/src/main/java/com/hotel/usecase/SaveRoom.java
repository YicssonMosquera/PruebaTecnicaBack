package com.hotel.usecase;

import com.hotel.model.Room;
import com.hotel.model.gateway.RoomRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveRoom {
    private final RoomRepository repository;

    public Mono<Room>save(Room room){
        Room saveRoom = room.toBuilder().location(room.getFloor()+room.getId_room()).build();
        return repository.save(saveRoom);
    }
}
