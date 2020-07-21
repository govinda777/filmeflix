package com.filmeFlix.Domain.Services.Interfaces;

import com.filmeFlix.Domain.Entities.CustomerInfo;

import java.util.List;

public interface Customer {
    List<CustomerInfo> findAll();
}
