package com.filmeFlix.Api;

import com.filmeFlix.Domain.Entities.CustomerInfo;
import com.filmeFlix.Domain.Services.Interfaces.Customer;
import com.filmeFlix.Infra.Data.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final Customer customer;

    @Autowired
    public CustomerController(Customer customer) {
        this.customer = customer;
    }

    @GetMapping("/customer")
    public List<CustomerInfo> customer(@RequestParam(value = "name", defaultValue = "World") String name) {
        return customer.findAll();
    }
}
