package bg.softuni.tabula.announcement.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Data
@Entity
@Table(name="announcements")
public class AnnouncementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private Instant createdOn;

    @NotNull
    @Column
    private Instant updatedOn;

    @NotNull
    @Column
    private String description;

    @NotNull
    @Column
    private String title;

}
