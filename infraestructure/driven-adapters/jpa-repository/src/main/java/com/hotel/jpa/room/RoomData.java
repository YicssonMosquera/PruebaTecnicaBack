package com.hotel.jpa.room;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "habitacion",schema = "db_hoteleria")
@Builder
@Getter
public class RoomData {

    @Id
    @Column(name = "Id_habitacion")
    private  String id_room;
    @Column(name = "Fecha_entrada")
    private  Date date_entrance;
    @Column(name = "Fecha_salida")
    private  Date date_exit;
    @Column(name = "Cantidad_huesped")
    private  Integer quantity_guest;
    @Column(name = "Disponibilidad")
    private  String availability;
    @Column(name = "Id_tipo_habitacion")
    private  Integer id_roomType;
    @Column(name = "Piso")
    private  Integer floor;
    @Column(name = "Ubicacion")
    private  String location;
}
