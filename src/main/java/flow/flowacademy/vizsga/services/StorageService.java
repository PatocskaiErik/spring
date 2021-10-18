package flow.flowacademy.vizsga.services;

import flow.flowacademy.vizsga.DTO.StorageDTO;
import flow.flowacademy.vizsga.models.Storage;
import flow.flowacademy.vizsga.repositories.StorageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class StorageService {

    private final StorageRepository storageRepository;

    public Storage addStorage(StorageDTO storageDTO) {
        return storageRepository.save(
                new Storage(null, storageDTO.getAddress(),new ArrayList<>())
        );
    }

    public Storage getStorageById(Long id) {
        return this.storageRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public void deleteStorage(Long id){
        storageRepository.deleteById(id);
    }

}
