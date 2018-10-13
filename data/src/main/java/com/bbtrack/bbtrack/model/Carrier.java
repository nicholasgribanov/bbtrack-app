package com.bbtrack.bbtrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "carrier")
public class Carrier extends User {
    @Column(name = "name_carrier")
    private String name;
    @Column(name="avto")
    private String avto;
    @Column(name = "max_volume")
    private String maxVolume;

    public Carrier(){}

    public Carrier(String avto, String maxVolume) {
        this.avto = avto;
        this.maxVolume = maxVolume;
    }

    public String getAvto() {
        return avto;
    }

    public void setAvto(String avto) {
        this.avto = avto;
    }

    public String getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(String maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
