package com.bbtrack.bbtrack.services.springdatajpa;

import com.bbtrack.bbtrack.model.CustomerLTD;
import com.bbtrack.bbtrack.repositories.CustomerLTDRepository;
import com.bbtrack.bbtrack.services.CustomerLDTService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class CustomerLTDSDJpaService implements CustomerLDTService {

    private final CustomerLTDRepository customerLTDRepository;

    public CustomerLTDSDJpaService(CustomerLTDRepository customerLTDRepository) {
        this.customerLTDRepository = customerLTDRepository;
    }

    @Override
    public Set<CustomerLTD> findAll() {
        Set<CustomerLTD> customerLTDS = new HashSet<>();
        customerLTDRepository.findAll().forEach(customerLTDS::add);
        return customerLTDS;
    }

    @Override
    public CustomerLTD findById(Long aLong) {
        return customerLTDRepository.findById(aLong).orElse(null);
    }

    @Override
    public CustomerLTD save(CustomerLTD object) {
        return customerLTDRepository.save(object);
    }

}
