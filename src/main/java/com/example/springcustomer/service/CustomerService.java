package com.example.springcustomer.service;

import com.example.springcustomer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements CustomerServiceImpl<Customer> {

    private List<Customer> customers = new ArrayList<>();

    public CustomerService() {
        customers.add(new Customer(1, "Tom", "Tom@gmail.com", "Beijing"));
        customers.add(new Customer(2, "Jerry", "Jerry1@gmail.com", "Shanghai"));
        customers.add(new Customer(3, "Jack", "Jack123@gmail.com", "Guangzhou"));
        customers.add(new Customer(4, "Peter", "Peter3@gmail.com", "Shenzhen"));
        customers.add(new Customer(5, "Lily", "Lily3@gmail.com", "Hangzhou"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
