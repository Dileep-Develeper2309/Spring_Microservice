package com.microservice.service.impl;

import com.microservice.dto.CustomerDto;
import com.microservice.repository.AccountsRepository;
import com.microservice.repository.CustomerRepository;
import com.microservice.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
