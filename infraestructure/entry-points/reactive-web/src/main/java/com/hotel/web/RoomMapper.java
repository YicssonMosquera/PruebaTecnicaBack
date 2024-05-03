package com.hotel.web;

import com.hotel.model.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public Room getRoom(RoomDataWeb roomDataWeb){
        return Room.builder()
                .id_room(roomDataWeb.getId_room())
                .date_entrance(roomDataWeb.getDate_entrance())
                .date_exit(roomDataWeb.getDate_exit())
                .quantity_guest(roomDataWeb.getQuantity_guest())
                .availability(roomDataWeb.getAvailability())
                .id_roomType(roomDataWeb.getId_roomType())
                .floor(roomDataWeb.getFloor())
                .build();
    }

}
