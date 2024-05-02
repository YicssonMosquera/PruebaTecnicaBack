package com.hotel.model;

import lombok.Builder;

import java.util.Date;

@Builder(toBuilder = true)
public class Room {
    public String getId_room() {
        return id_room;
    }

    public Date getDate_entrance() {
        return date_entrance;
    }

    public Date getDate_exit() {
        return date_exit;
    }

    public Integer getQuantity_guest() {
        return quantity_guest;
    }

    public String getAvailability() {
        return availability;
    }

    public Integer getId_roomType() {
        return id_roomType;
    }

    private final String id_room;
    private final Date date_entrance;
    private final Date date_exit;
    private final Integer quantity_guest;
    private final String availability;
    private final Integer id_roomType;

    public String getLocation() {
        return location;
    }

    private final String location;

    public Integer getFloor() {
        return floor;
    }

    private final Integer floor;

}
