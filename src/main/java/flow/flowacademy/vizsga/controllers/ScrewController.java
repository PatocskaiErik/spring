package flow.flowacademy.vizsga.controllers;

import flow.flowacademy.vizsga.DTO.ScrewDTO;
import flow.flowacademy.vizsga.models.Screw;
import flow.flowacademy.vizsga.services.ScrewService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping
@Slf4j
@AllArgsConstructor
public class ScrewController {

    private final ScrewService screwservice;

    @PostMapping
    public ResponseEntity<Screw> addScrew(@RequestBody @Valid ScrewDTO screwDTO) {
        screwservice.addScrew(screwDTO);
        return new ResponseEntity<>(screwservice.addScrew(screwDTO), HttpStatus.CREATED);
    }
}
