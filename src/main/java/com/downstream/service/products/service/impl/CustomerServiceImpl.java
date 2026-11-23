package com.downstream.service.products.service.impl;

import com.downstream.service.products.model.Customer;
import com.downstream.service.products.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer getCustomerDetails() {
        return new Customer(
                1,
                "Rajeev",
                "ACTIVE"
        );
    }
}