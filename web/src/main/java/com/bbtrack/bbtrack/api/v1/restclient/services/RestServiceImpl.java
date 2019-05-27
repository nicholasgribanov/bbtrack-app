package com.bbtrack.bbtrack.api.v1.restclient.services;

import com.bbtrack.bbtrack.api.v1.mapper.CarrierMapper;
import com.bbtrack.bbtrack.api.v1.model.CarrierDTO;
import com.bbtrack.bbtrack.services.CarrierService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class RestServiceImpl implements RestService {
    private final CarrierService service;
    private final CarrierMapper mapper;

    public RestServiceImpl(CarrierService service, CarrierMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public CarrierDTO getCarrierById(Long id) {
        return mapper.carrierToCarrierDto(service.findById(id));
    }
}
