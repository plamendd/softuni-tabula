package bg.softuni.tabula.announcement;


import bg.softuni.tabula.announcement.model.AnnoucementMapper;
import bg.softuni.tabula.announcement.model.AnnouncementDTO;
import bg.softuni.tabula.announcement.repository.AnnouncementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AnnouncementService {
    private final AnnouncementRepository announcementRepository;

    public List<AnnouncementDTO> findAll(){
        return announcementRepository.
                findAll().
                stream().
                map(AnnoucementMapper.INSTANCE::mapAnnoucementEntityToDto).
                collect(Collectors.toList());
    }
}
