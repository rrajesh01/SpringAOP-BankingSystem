package com.rajesh.service;

import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImp implements AccountService {

    @Override
    public void withdraw(int accId, double amount) {
        System.out.println("Executing withdraw() - Account ID: " + accId + ", Amount: " + amount);
        // Simulate logic here
    }

    @Override
    public void deposit(int accId, double amount) {
        System.out.println("Executing deposit() - Account ID: " + accId + ", Amount: " + amount);
        // Simulate logic here
    }

    @Override
    public void transfer(int sourceAccId, int destAccId, double amount) {
        System.out.println("Executing transfer() - From Account ID: " + sourceAccId + " to Account ID: " + destAccId + ", Amount: " + amount);
        // Simulate logic here
    }
}
