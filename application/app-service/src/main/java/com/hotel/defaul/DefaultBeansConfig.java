package com.hotel.defaul;

import com.hotel.model.Room;
import com.hotel.model.gateway.RoomRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class DefaultBeansConfig {
    @Bean
    @ConditionalOnMissingBean
    public RoomRepository repository(){
        return repository();
    }

    private final RoomRepository roomRepository= new RoomRepository() {
        @Override
        public Mono<Room> save(Room room) {
            return Mono.empty();
        }

        @Override
        public Mono<Void> deleted(Integer id) {
            return Mono.empty();
        }
    };
}
