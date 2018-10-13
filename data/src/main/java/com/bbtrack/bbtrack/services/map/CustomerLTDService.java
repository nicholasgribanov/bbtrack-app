package com.bbtrack.bbtrack.services.map;

import com.bbtrack.bbtrack.model.CustomerLTD;
import com.bbtrack.bbtrack.services.CustomerLDTService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("default")
public class CustomerLTDService extends AbstractMapService<CustomerLTD, Long> implements CustomerLDTService {

    @Override
    public Set<CustomerLTD> findAll() {
        return super.findAll();
    }

    @Override
    public CustomerLTD findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public CustomerLTD save(CustomerLTD object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(CustomerLTD object) {
        super.delete(object);
    }

}
