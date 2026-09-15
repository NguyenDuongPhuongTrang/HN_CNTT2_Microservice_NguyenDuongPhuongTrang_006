package th.roomservice.service;

import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import th.roomservice.entity.Room;
import th.roomservice.openfeign.RoomTypeServiceCall;
import th.roomservice.repository.RoomRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;
    private final RoomTypeServiceCall roomTypeClient;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room createRoom(Room room) {
        try {
            roomTypeClient.getRoomTypeById(room.getRoomTypeId());
        } catch (FeignException.NotFound ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RoomTypeId không tồn tại");
        }
        room.setIsDeleted(false);
        return roomRepository.save(room);
    }
}
