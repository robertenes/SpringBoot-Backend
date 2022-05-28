package com.backend.customer.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@EqualsAndHashCode

@Document
public class CustomerModel {

    @Id
    private String Id;
    private String customerName;
    private String customerLastName;
    private int age;
    private LocalDate birthDate;
    private String address;

}
