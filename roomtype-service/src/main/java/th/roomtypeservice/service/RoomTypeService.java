package th.roomtypeservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import th.roomtypeservice.entity.RoomType;
import th.roomtypeservice.repository.RoomTypeRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomTypeService {

    private final RoomTypeRepository roomTypeRepository;

    public Optional<RoomType> findById(Long id) {
        return roomTypeRepository.findById(id);
    }

    public RoomType save(RoomType roomType) {
        return roomTypeRepository.save(roomType);
    }
}
