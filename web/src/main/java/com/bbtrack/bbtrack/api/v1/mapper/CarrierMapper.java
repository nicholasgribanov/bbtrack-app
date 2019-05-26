package com.bbtrack.bbtrack.api.v1.mapper;

import com.bbtrack.bbtrack.api.v1.model.CarrierDTO;
import com.bbtrack.bbtrack.model.Carrier;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarrierMapper {
    CarrierMapper INSTANCE = Mappers.getMapper(CarrierMapper.class);

    CarrierDTO carrierToCarrierDto(Carrier carrier);
}
