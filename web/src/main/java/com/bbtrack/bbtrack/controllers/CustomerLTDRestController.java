package com.bbtrack.bbtrack.controllers;

import com.bbtrack.bbtrack.api.v1.model.CustomerLTDdto;
import com.bbtrack.bbtrack.api.v1.restclient.services.RestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerrest")
public class CustomerLTDRestController {
    private final RestService service;

    public CustomerLTDRestController(RestService service) {
        this.service = service;
    }

    @GetMapping({"{id}"})
    public CustomerLTDdto getCustomerById(@PathVariable Long id) {
        return service.getCustomerLTDbyId(id);
    }
}
