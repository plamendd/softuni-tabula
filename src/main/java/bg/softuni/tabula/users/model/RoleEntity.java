package bg.softuni.tabula.users.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="roles")
public class RoleEntity {
    @Id
    @Column(name="id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="role", nullable = false)
    private String role;
}
