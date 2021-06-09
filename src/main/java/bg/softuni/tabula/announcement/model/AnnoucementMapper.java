package bg.softuni.tabula.announcement.model;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnnoucementMapper {

    AnnoucementMapper INSTANCE = Mappers.getMapper(AnnoucementMapper.class);

    AnnouncementEntity mapAnnoucementDtoToEntity(AnnouncementDTO dto);

    AnnouncementDTO mapAnnoucementEntityToDto(AnnouncementEntity entity);
}
