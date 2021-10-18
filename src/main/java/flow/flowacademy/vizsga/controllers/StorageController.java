package flow.flowacademy.vizsga.controllers;

import flow.flowacademy.vizsga.DTO.StorageDTO;
import flow.flowacademy.vizsga.services.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/storage")
public class StorageController {

    private final StorageService storageService;

    @PostMapping
    public ResponseEntity<?> addStorage(@RequestBody StorageDTO storageDTO) {
        var savedStorage = storageService.addStorage(storageDTO);

        return ResponseEntity.ok(Map.of("Address", savedStorage.getAddress()));
    }

    @GetMapping("/api/storage/address/{id}")
    public ResponseEntity<?> getStorageAddress(@PathVariable Long id) {

        var storage = storageService.getStorageById(id);

        return ResponseEntity.ok(storage);
    }

    @DeleteMapping("/api/storage{id}")
    public ResponseEntity<Void> deleteStorage(@PathVariable Long id) {
        storageService.deleteStorage(id);
        return ResponseEntity.noContent().build();
    }
}
