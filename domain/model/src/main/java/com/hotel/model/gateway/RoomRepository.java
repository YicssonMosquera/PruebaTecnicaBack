package com.hotel.model.gateway;

import com.hotel.model.Room;
import reactor.core.publisher.Mono;

public interface RoomRepository {
    Mono<Room>save(Room room);
    Mono<Void> deleted(Integer id);
}
