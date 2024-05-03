package com.hotel.jpa.room;

import com.hotel.model.Room;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RoomDataAdapterTest {
    @InjectMocks
    RoomDataAdapter roomDataAdapter;

    @Mock
    RoomDataRepository repository;

    @Mock
    RoomDataMapper mapper;

    @Test
    void save() {
        Mockito.when(mapper.getRoomData(Mockito.any())).thenReturn(RoomData.builder().build());
        Mockito.when(mapper.getRoom(Mockito.any())).thenReturn(Room.builder().build());
        Mockito.when(repository.save(Mockito.any())).thenReturn(Mono.just(Room.builder().build()));
        StepVerifier.create(roomDataAdapter.save(Mockito.any())).verifyComplete();
    }

    @Test
    void deleted() {
        repository.deleteById(Mockito.any());
        StepVerifier.create(roomDataAdapter.deleted(Mockito.any())).verifyComplete();
    }
}