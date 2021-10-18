package flow.flowacademy.vizsga.services;

import flow.flowacademy.vizsga.DTO.ScrewDTO;
import flow.flowacademy.vizsga.models.Screw;
import flow.flowacademy.vizsga.repositories.ScrewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScrewService {

    private final ScrewRepository screwRepository;

    private final StorageService storageService;

    public Screw addScrew(ScrewDTO screwDTO) {
        var storage = storageService.getStorageById(screwDTO.getStorageID());
        var screw = new Screw(null, screwDTO.getSerialID(), screwDTO.getSize(), storage);

        return screwRepository.save(screw);
    }
}
