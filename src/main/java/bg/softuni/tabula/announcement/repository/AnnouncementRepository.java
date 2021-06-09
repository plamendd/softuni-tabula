package bg.softuni.tabula.announcement.repository;

import bg.softuni.tabula.announcement.model.AnnouncementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository  extends JpaRepository<AnnouncementEntity, Long> {

}
