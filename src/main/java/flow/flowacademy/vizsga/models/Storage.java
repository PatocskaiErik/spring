package flow.flowacademy.vizsga.models;
import lombok.*;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String address;

    @OneToMany(cascade = ALL, mappedBy = "storage")
    private List<Screw> screws;
}
