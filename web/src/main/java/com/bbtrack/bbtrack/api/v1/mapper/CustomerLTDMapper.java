package com.bbtrack.bbtrack.api.v1.mapper;

import com.bbtrack.bbtrack.api.v1.model.CustomerLTDdto;
import com.bbtrack.bbtrack.model.CustomerLTD;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerLTDMapper {
    CustomerLTDMapper INSTANCE = Mappers.getMapper(CustomerLTDMapper.class);

    CustomerLTDdto customerLTDtoCustomerLTDdto(CustomerLTD customerLTD);
}
