package com.bbtrack.bbtrack.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "carrier")
public class Carrier extends User {
    @Column(name = "name_carrier")
    private String name;
    @Column(name="avto")
    private String avto;
    @Column(name = "max_volume")
    private String maxVolume;

}
