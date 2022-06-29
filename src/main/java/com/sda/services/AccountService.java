package com.sda.services;

public class AccountService {

    public void withdraw(String accountNumber, double amount) {
        if (amount > 0 && validateAccountNumber(accountNumber)) {
            System.out.println(amount + " has been withdraw from " + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (amount > 0 && validateAccountNumber(accountNumber)) {
            System.out.println(amount + " has been deposit into " + accountNumber);
        }
    }


    private static boolean validateAccountNumber(String accountNumber) {
        return accountNumber != null && !accountNumber.isEmpty();
    }
}
