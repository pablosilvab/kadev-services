package com.kadev.customer.services;

import com.kadev.customer.controller.CustomerRegistrationRequest;
import com.kadev.customer.model.Customer;
import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
       Customer customer = Customer.builder()
               .firstName(request.firstName())
               .lastName(request.lastName())
               .email(request.email())
               .build();
       // TODO: check validations
    }
}
