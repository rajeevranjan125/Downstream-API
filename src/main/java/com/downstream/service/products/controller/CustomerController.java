package com.downstream.service.products.controller;

import com.downstream.service.products.model.Customer;
import com.downstream.service.products.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/products")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getProductDetails(@PathVariable int id) {

        Customer customer = customerService.getCustomerDetails();

        return ResponseEntity.ok(customer);
    }
}
