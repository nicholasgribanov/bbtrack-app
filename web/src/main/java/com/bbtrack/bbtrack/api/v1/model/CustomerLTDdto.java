package com.bbtrack.bbtrack.api.v1.model;

import lombok.Data;

@Data
public class CustomerLTDdto {
    private String name;
    private Long inn;
    private Long ogrn;
    private String adressLtd;
    private String adressFact;
}
