package th.roomservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.roomservice.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
