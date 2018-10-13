package com.bbtrack.bbtrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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

    public CustomerLTD(){}

    public CustomerLTD(Long inn, Long ogrn, String adressLtd, String adressFact) {
        this.inn = inn;
        this.ogrn = ogrn;
        this.adressLtd = adressLtd;
        this.adressFact = adressFact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public Long getOgrn() {
        return ogrn;
    }

    public void setOgrn(Long ogrn) {
        this.ogrn = ogrn;
    }

    public String getAdressLtd() {
        return adressLtd;
    }

    public void setAdressLtd(String adressLtd) {
        this.adressLtd = adressLtd;
    }

    public String getAdressFact() {
        return adressFact;
    }

    public void setAdressFact(String adressFact) {
        this.adressFact = adressFact;
    }
}
