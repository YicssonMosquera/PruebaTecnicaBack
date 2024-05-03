package com.hotel.web;

import com.hotel.model.Room;
import com.hotel.usecase.DeleteRoom;
import com.hotel.usecase.SaveRoom;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.sql.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RoomControllerTest {
    @InjectMocks
    RoomController controller;
    @Mock
    SaveRoom saveRoom;
    @Mock
     RoomMapper mapper;
    @Mock
    DeleteRoom deleteRoom;

    RoomDataWeb room =  RoomDataWeb.builder().id_room("test")
            .date_entrance(Date.valueOf("2023-01-01"))
            .date_exit(Date.valueOf("2023-01-01"))
            .quantity_guest(2)
            .availability("12")
            .id_roomType(1)
            .floor(1).build();


    @Test
    void saveRoom() {
        ResponseEntity entity = ResponseEntity.ok().build();
        Mockito.when(saveRoom.save(Mockito.any())).thenReturn(Mono.just(Room.builder().build()));
        Mockito.when(mapper.getRoom(room)).thenReturn(Room.builder().build());
        assertThat(controller.saveRoom(room).getStatusCode()).isEqualTo(entity.getStatusCode());
    }

    @Test
    void delete(){
        Mockito.when(deleteRoom.deleteRoom(Mockito.any())).thenReturn(Mono.empty());
        StepVerifier.create(controller.delete(Mockito.any())).verifyComplete();
    }
}