package com.sda.validators;

public class AccountNumberValidator {

    public static boolean validate(String accountNumber){
        return accountNumber != null && !accountNumber.isEmpty();
    }
}