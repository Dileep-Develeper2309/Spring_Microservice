package com.microservice.service;

import com.microservice.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);
}
