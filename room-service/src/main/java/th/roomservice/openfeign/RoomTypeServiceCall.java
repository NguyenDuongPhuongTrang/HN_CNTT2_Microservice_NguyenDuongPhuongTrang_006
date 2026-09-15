package th.roomservice.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import th.roomservice.dto.RoomTypeDto;

@FeignClient(name = "roomtype-service")
public interface RoomTypeServiceCall {

    @GetMapping("/api/roomtypes/{id}")
    RoomTypeDto getRoomTypeById(@PathVariable("id") Long id);
}
