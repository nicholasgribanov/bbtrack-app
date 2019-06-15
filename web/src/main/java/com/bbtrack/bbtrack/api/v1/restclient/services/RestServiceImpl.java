package com.bbtrack.bbtrack.api.v1.restclient.services;

import com.bbtrack.bbtrack.api.v1.mapper.CarrierMapper;
import com.bbtrack.bbtrack.api.v1.mapper.CustomerLTDMapper;
import com.bbtrack.bbtrack.api.v1.model.CarrierDTO;
import com.bbtrack.bbtrack.api.v1.model.CustomerLTDdto;
import com.bbtrack.bbtrack.services.CarrierService;
import com.bbtrack.bbtrack.services.CustomerLDTService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class RestServiceImpl implements RestService {
    private final CarrierService service;
    private final CustomerLDTService customerLDTService;
    private final CarrierMapper mapper;
    private final CustomerLTDMapper customerLTDMapper;

    public RestServiceImpl(CarrierService service, CustomerLDTService customerLDTService, CarrierMapper mapper, CustomerLTDMapper customerLTDMapper) {
        this.service = service;
        this.customerLDTService = customerLDTService;
        this.mapper = mapper;
        this.customerLTDMapper = customerLTDMapper;
    }

    @Override
    public CarrierDTO getCarrierById(Long id) {
        return mapper.carrierToCarrierDto(service.findById(id));
    }

    @Override
    public CustomerLTDdto getCustomerLTDbyId(Long id) {
        return customerLTDMapper.customerLTDtoCustomerLTDdto(customerLDTService.findById(id));
    }
}
