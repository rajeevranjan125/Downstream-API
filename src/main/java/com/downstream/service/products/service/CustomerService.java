package com.downstream.service.products.service;

import com.downstream.service.products.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Customer getCustomerDetails();
}
