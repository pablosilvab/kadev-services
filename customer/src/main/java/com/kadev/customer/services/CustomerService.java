package com.kadev.customer.services;

import com.kadev.customer.controller.CustomerRegistrationRequest;
import com.kadev.customer.model.Customer;
import com.kadev.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // TODO: check if email valid
        // TODO: check if email not taken
        customerRepository.save(customer);
    }
}
