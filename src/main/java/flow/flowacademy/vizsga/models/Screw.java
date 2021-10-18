package flow.flowacademy.vizsga.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Screw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String serialId;

    private Integer size;

    @ManyToOne
    @JoinColumn(name = "stable_id")
    @JsonIgnore
    private Storage storage;
}
