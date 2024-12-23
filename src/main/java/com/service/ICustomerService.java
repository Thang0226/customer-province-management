package com.service;

import com.model.Customer;
import com.model.Province;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
