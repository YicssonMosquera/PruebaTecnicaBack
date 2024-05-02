package com.hotel.usecase;

import com.hotel.model.gateway.RoomRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class DeleteRoom {
    private final RoomRepository repository;

    public Mono<Void>deleteRoom(Integer id){
        return repository.deleted(id);
    }
}
