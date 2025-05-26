package com.example.springcustomer.service;

import java.util.List;

public interface CustomerServiceImpl <E> {
    List<E> findAll();
    E findById(int id);
}
