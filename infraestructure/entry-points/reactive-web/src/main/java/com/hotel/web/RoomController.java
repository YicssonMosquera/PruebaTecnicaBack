package com.hotel.web;

import com.hotel.usecase.DeleteRoom;
import com.hotel.usecase.SaveRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "api/hotel")
public class RoomController {
    private final SaveRoom saveRoom;
    private final DeleteRoom deleteRoom;
    private final RoomMapper mapper;

    @PostMapping(path = "/save")
    public ResponseEntity<?>saveRoom(@RequestBody RoomDataWeb roomDataWeb){
        return new ResponseEntity(saveRoom.save(mapper.getRoom(roomDataWeb)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete{id}")
    public Mono<Void>delete(@PathVariable Integer id){
        return deleteRoom.deleteRoom(id);
    }


}
