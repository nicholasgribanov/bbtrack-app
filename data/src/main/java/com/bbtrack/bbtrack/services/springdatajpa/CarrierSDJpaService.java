package com.bbtrack.bbtrack.services.springdatajpa;


import com.bbtrack.bbtrack.model.Carrier;
import com.bbtrack.bbtrack.repositories.CarrierRepository;
import com.bbtrack.bbtrack.services.CarrierService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class CarrierSDJpaService implements CarrierService {

    private final CarrierRepository carrierRepository;

    public CarrierSDJpaService(CarrierRepository carrierRepository) {
        this.carrierRepository = carrierRepository;
    }

    @Override
    public Set<Carrier> findAll() {
        Set<Carrier> carriers = new HashSet<>();
        carrierRepository.findAll().forEach(carriers::add);
        return carriers;
    }

    @Override
    public Carrier findById(Long aLong) {
        return carrierRepository.findById(aLong).orElse(null);
    }

    @Override
    public Carrier save(Carrier object) {
        return carrierRepository.save(object);
    }

    @Override
    public void delete(Carrier object) {
        carrierRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        carrierRepository.deleteById(aLong);
    }
}
