package com.hotel;

import com.hotel.model.gateway.RoomRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UseCaseConfigTest {
    @InjectMocks
    UseCaseConfig useCaseConfig;

    @Mock
    RoomRepository repository;

    @Test
    void saveRoom() {
        assertThat(useCaseConfig.saveRoom(repository)).isNotNull();
    }

    @Test
    void deleteRoom() {
        assertThat(useCaseConfig.deleteRoom(repository)).isNotNull();
    }
}