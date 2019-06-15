package com.carsservices.org.CarsService.controllers;

import com.carsservices.org.CarsService.models.BodyType;
import com.carsservices.org.CarsService.models.Brand;
import com.carsservices.org.CarsService.repositorys.BodyTypeRepository;
import com.carsservices.org.CarsService.repositorys.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequestMapping(path = "/car")
public class CarController {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private BodyTypeRepository bodyTypeRepository;

    @GetMapping(path="/addBrand") // Map ONLY GET Requests
    public @ResponseBody String addNewBrand (@RequestParam String name) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Brand brand = new Brand();
        brand.setName(name);
        brandRepository.save(brand);
        return "Saved brand";
    }

    @GetMapping(path="/addBodyType") // Map ONLY GET Requests
    public @ResponseBody String addBodyType (@RequestParam String name) {

        BodyType bodyType = new BodyType();
        bodyType.setName(name);
        bodyTypeRepository.save(bodyType);
        return "Saved body type";
    }



}
