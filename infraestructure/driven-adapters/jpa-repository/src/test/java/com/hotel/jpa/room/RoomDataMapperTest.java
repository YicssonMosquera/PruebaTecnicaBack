package com.hotel.jpa.room;

import com.hotel.model.Room;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RoomDataMapperTest {
    @InjectMocks
    RoomDataMapper mapper;

    @Test
    void getRoom() {
        assertThat(mapper.getRoom(RoomData.builder().build())).isNotNull();
    }

    @Test
    void getRoomData() {
        assertThat(mapper.getRoomData(Room.builder().build())).isNotNull();
    }
}