package com.hotel.usecase;

import com.hotel.model.gateway.RoomRepository;
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
class DeleteRoomTest {
    @InjectMocks
    DeleteRoom deleteRoom;

    @Mock
    RoomRepository repository;

    @Test
    void deleteRoom() {
        Mockito.when(repository.deleted(Mockito.any())).thenReturn(Mono.empty());
        StepVerifier.create(deleteRoom.deleteRoom(Mockito.any())).verifyComplete();
    }
}