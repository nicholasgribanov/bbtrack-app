package com.bbtrack.bbtrack.model;

public class Carrier extends User {
    private String name;
    private String avto;
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
