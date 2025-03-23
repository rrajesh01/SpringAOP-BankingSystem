package com.rajesh.service;

public interface AccountService {
	void withdraw(int accId, double amount);

	void deposit(int accId, double amount);

	void transfer(int sourceAccId, int destAccId, double amount);
}
