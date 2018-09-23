package com.bbtrack.bbtrack.services.map;

import com.bbtrack.bbtrack.model.Carrier;
import com.bbtrack.bbtrack.services.CarrierService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CarrierMapService extends AbstractMapService<Carrier, Long> implements CarrierService  {

    @Override
    public Set<Carrier> findAll() {
        return super.findAll();
    }

    @Override
    public Carrier findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Carrier save(Carrier object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Carrier object) {
        super.delete(object);
    }


}
