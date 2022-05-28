package com.backend.customer.controller;

import com.backend.customer.model.CustomerModel;
import com.backend.customer.service.CustomerService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAllCustomers")
    public ResponseEntity<List<CustomerModel>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<Boolean> saveCustomer(@RequestBody CustomerModel customerModel) {
        return ResponseEntity.ok(customerService.saveCustomer(customerModel));
    }

}
