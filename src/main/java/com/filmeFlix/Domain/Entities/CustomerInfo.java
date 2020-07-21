package com.filmeFlix.Domain.Entities;

import org.springframework.data.annotation.Id;


public class CustomerInfo {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public CustomerInfo() {}

    public CustomerInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}