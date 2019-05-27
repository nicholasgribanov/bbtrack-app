package com.bbtrack.bbtrack.api.v1.restclient.services;

import com.bbtrack.bbtrack.api.v1.model.CarrierDTO;

public interface RestService {
    CarrierDTO getCarrierById(Long id);

}
