package bg.softuni.tabula.announcement.repository;

import bg.softuni.tabula.announcement.model.AnnouncementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;

public interface AnnouncementRepository  extends JpaRepository<AnnouncementEntity, Long> {

    void deleteByUpdatedOnBefore(Instant before);

}
