package com.downstream.service.products.controller;

import com.downstream.service.products.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/products")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getProductDetails(@PathVariable int id) {

        return new Customer(id, "Rajeev", "ACTIVE");
    }
}
