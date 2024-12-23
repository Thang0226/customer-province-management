package com.service;

import com.model.Customer;
import com.model.Province;

public interface ICustomerService extends IService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
