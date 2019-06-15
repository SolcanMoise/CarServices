package com.carsservices.org.CarsService.models;

import javax.persistence.*;

/**
 * Represents a car model
 * @author solcanm
 */

@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn
    private Brand brandId;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
