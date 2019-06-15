package com.carsservices.org.CarsService.repositorys;

import com.carsservices.org.CarsService.models.Brand;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called brandRepository
 * CRUD refers Create, Read, Update, Delete
 */

public interface BrandRepository extends CrudRepository<Brand, Integer> {
}
