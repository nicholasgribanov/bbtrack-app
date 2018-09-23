package com.bbtrack.bbtrack.model;

public class CustomerLTD extends User {
    private String name;
    private Long inn;
    private Long ogrn;
    private String adressLtd;
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
