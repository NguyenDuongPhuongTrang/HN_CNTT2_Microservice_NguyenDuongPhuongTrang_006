package th.roomtypeservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import th.roomtypeservice.entity.RoomType;
import th.roomtypeservice.service.RoomTypeService;

@RestController
@RequestMapping("/api/roomtypes")
@RequiredArgsConstructor
public class RoomTypeController {

    private final RoomTypeService roomTypeService;

    @GetMapping("/{id}")
    public ResponseEntity<RoomType> getRoomTypeById(@PathVariable Long id) {
        RoomType roomType = roomTypeService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RoomType không tồn tại với id: " + id));
        return ResponseEntity.ok(roomType);
    }

    @PostMapping
    public ResponseEntity<RoomType> createRoomType(@RequestBody RoomType roomType) {
        RoomType saved = roomTypeService.save(roomType);
        return ResponseEntity.ok(saved);
    }
}
