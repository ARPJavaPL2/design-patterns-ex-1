package com.sda.validators;

import com.sda.services.AccountService;
import com.sda.services.TransferService;

public class Main {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        String accountNumber = "0909 0909 2124 1231";

        accountService.deposit(accountNumber, 10.00);
        accountService.withdraw(accountNumber, 5.00);

        TransferService transferService = new TransferService();

        String accountNumber2 = "1009 1909 2124 0531";
        transferService.transfer(accountNumber, accountNumber2, 20.00);
    }
}
