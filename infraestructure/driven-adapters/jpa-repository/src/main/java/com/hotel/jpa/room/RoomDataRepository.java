package com.hotel.jpa.room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface RoomDataRepository extends CrudRepository<RoomData, Integer>, QueryByExampleExecutor<RoomData> {
}
