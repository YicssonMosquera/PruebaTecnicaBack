package com.hotel;

import com.hotel.model.gateway.RoomRepository;
import com.hotel.usecase.DeleteRoom;
import com.hotel.usecase.SaveRoom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public SaveRoom saveRoom(RoomRepository repository){
        return new SaveRoom(repository);
    }

    @Bean
    public DeleteRoom deleteRoom(RoomRepository repository){
        return new DeleteRoom(repository);
    }

}
