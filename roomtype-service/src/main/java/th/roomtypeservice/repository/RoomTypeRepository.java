package th.roomtypeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.roomtypeservice.entity.RoomType;

public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {
}
