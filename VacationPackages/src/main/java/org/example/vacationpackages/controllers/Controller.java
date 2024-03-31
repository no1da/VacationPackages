package org.example.vacationpackages.controllers;

import org.example.vacationpackages.dto.RequestDTO;
import org.example.vacationpackages.dto.ResponseDTO;
import org.example.vacationpackages.services.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class Controller {
    private final VacationService vacationService;

    @Autowired
    public Controller(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @GetMapping
    public ResponseDTO getSum(@RequestBody RequestDTO requestDTO) {
        return vacationService.getSum(requestDTO);
    }
}
