package com.hotel.usecase;

import com.hotel.model.Room;
import com.hotel.model.gateway.RoomRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SaveRoomTest {
    @InjectMocks
    SaveRoom saveRoom;

    @Mock
    RoomRepository repository;

    Room room =  Room.builder().id_room("test")
            .date_entrance(Date.valueOf("2023-01-01"))
            .date_exit(Date.valueOf("2023-01-01"))
            .quantity_guest(2)
            .availability("12")
            .id_roomType(1)
            .floor(1)
            .location("123").build();

    @Test
    void save() {
        Mockito.when(repository.save(Mockito.any()).thenReturn(Mono.just(room)));
        StepVerifier.create(saveRoom.save(room))
                .verifyComplete();

    }
}