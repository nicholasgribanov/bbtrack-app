package com.bbtrack.bbtrack.controllers;

import com.bbtrack.bbtrack.api.v1.model.CarrierDTO;
import com.bbtrack.bbtrack.api.v1.restclient.services.RestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/carriers")
public class CarrierRestController {

    private final RestService service;

    public CarrierRestController(RestService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public CarrierDTO getCarrierDtoById(@PathVariable Long id){
        return service.getCarrierById(id);
    }

}
