package flow.flowacademy.vizsga.repositories;

import flow.flowacademy.vizsga.models.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Long> {
}
