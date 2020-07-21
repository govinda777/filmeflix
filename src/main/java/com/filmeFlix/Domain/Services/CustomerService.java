package com.filmeFlix.Domain.Services;

import com.filmeFlix.Domain.Entities.CustomerInfo;
import com.filmeFlix.Domain.Services.Interfaces.Customer;
import com.filmeFlix.Infra.Data.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements Customer {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerInfo> findAll(){
        return customerRepository.findAll();
    }
}
