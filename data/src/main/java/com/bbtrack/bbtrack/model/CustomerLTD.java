package com.bbtrack.bbtrack.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_ltd")
public class CustomerLTD extends User {
    @Column(name = "name_cst")
    private String name;
    @Column(name = "inn")
    private Long inn;
    @Column(name = "ogrn")
    private Long ogrn;
    @Column(name = "adress")
    private String adressLtd;
    @Column(name = "adress_fact")
    private String adressFact;

}
