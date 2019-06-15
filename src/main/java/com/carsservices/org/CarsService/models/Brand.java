package com.carsservices.org.CarsService.models;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents a car brand.
 * @author solcanm
 */

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "brandId", cascade = CascadeType.ALL)
    private Set<Model> models;

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
