package flow.flowacademy.vizsga.repositories;

import flow.flowacademy.vizsga.models.Screw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrewRepository extends JpaRepository<Screw, Long> {
}
