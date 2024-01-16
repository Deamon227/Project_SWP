package com.example.demo.service.customer;
import com.example.demo.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void deleteById(Long id);
}