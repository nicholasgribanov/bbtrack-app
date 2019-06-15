package com.bbtrack.bbtrack.api.v1.restclient.services;

import com.bbtrack.bbtrack.api.v1.model.CarrierDTO;
import com.bbtrack.bbtrack.api.v1.model.CustomerLTDdto;

public interface RestService {
    CarrierDTO getCarrierById(Long id);
    CustomerLTDdto getCustomerLTDbyId(Long id);

}
