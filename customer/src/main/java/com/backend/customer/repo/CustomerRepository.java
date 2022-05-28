package com.backend.customer.repo;

import com.backend.customer.model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerModel, String> {



}
