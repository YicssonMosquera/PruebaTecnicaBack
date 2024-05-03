package com.hotel.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
public class RoomDataWeb implements Serializable {
    @JsonProperty("Id_habitacion")
    private  String id_room;
    @JsonProperty("Fecha_entrada")
    private Date date_entrance;
    @JsonProperty("Fecha_salida")
    private  Date date_exit;
    @JsonProperty( "Cantidad_huesped")
    private  Integer quantity_guest;
    @JsonProperty("Disponibilidad")
    private  String availability;
    @JsonProperty("tipo_habitacion")
    private  Integer id_roomType;
    @JsonProperty("Piso")
    private  Integer floor;

}
