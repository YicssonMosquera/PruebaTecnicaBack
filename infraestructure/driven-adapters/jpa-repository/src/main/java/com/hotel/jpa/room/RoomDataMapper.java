package com.hotel.jpa.room;

import com.hotel.model.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomDataMapper {

    public Room getRoom(RoomData roomData){
        return Room.builder()
                .id_room(roomData.getId_room())
                .date_entrance(roomData.getDate_entrance())
                .date_exit(roomData.getDate_exit())
                .quantity_guest(roomData.getQuantity_guest())
                .availability(roomData.getAvailability())
                .id_roomType(roomData.getId_roomType())
                .floor(roomData.getFloor())
                .location(roomData.getLocation()).build();

    }

    public RoomData getRoomData(Room room){
        return RoomData.builder().id_room(room.getId_room())
                .date_entrance(room.getDate_entrance())
                .date_exit(room.getDate_exit())
                .quantity_guest(room.getQuantity_guest())
                .availability(room.getAvailability())
                .id_roomType(room.getId_roomType())
                .floor(room.getFloor())
                .location(room.getLocation()).build();
    }
}
