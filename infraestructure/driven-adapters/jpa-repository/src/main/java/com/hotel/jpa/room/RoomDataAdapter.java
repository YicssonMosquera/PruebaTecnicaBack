package com.hotel.jpa.room;

import com.hotel.model.Room;
import com.hotel.model.gateway.RoomRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class RoomDataAdapter implements RoomRepository {
    private final RoomDataRepository repository;
    private final RoomDataMapper mapper;

    public RoomDataAdapter(RoomDataRepository repository, RoomDataMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Mono<Room> save(Room room) {
        return Mono.just(mapper.getRoom(repository.save(mapper.getRoomData(room))));
    }

    @Override
    public Mono<Void> deleted(Integer id) {
        repository.deleteById(id);
        return Mono.empty();
    }

}
