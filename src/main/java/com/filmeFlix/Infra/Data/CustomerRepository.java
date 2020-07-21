package com.filmeFlix.Infra.Data;

import java.util.List;

import com.filmeFlix.Domain.Entities.CustomerInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerInfo, String> {

    public CustomerInfo findByFirstName(String firstName);
    public List<CustomerInfo> findByLastName(String lastName);

}