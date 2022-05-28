package com.backend.customer.service;

import com.backend.customer.model.CustomerModel;
import com.backend.customer.repo.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerModel> getAllCustomers() {
        return customerRepository.findAll();
    }

    public boolean saveCustomer(CustomerModel customerModel) {
        if(customerModel != null) {
            customerRepository.save(customerModel);
            return true;
        }
        return false;
    }


}
