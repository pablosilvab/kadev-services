package com.kadev.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
