package com.carsservices.org.CarsService.repositorys;

import com.carsservices.org.CarsService.models.Model;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<Model, Integer> {
}
