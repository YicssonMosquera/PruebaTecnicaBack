package com.hotel.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class RoomMapperTest {
    @InjectMocks
    RoomMapper mapper;

    @Test
    void getRoom() {
        assertThat(mapper.getRoom(RoomDataWeb.builder().build())).isNotNull();
    }
}