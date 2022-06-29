package com.sda.services;

import com.sda.validators.AccountNumberValidator;

public class TransferService {


    public void transfer(final String sourceAccountNumber, final String destinationAccountNumber, double ammount) {
        validateAccountNumbers(sourceAccountNumber, destinationAccountNumber);

        if (ammount > 0 && AccountNumberValidator.validate(destinationAccountNumber)) {
            System.out.println("Money from " + sourceAccountNumber + " to " + destinationAccountNumber + " has been transferred ...");
        }
    }

    private void validateAccountNumbers(String sourceAccountNumber, String destinationAccountNumber) {

        boolean sourceValid = AccountNumberValidator.validate(sourceAccountNumber);
        boolean destinationValid = AccountNumberValidator.validate(destinationAccountNumber);

        if (!sourceValid) {
            System.err.println("Invalid source accounts number");
        }

        if (!destinationValid) {
            System.err.println("Invalid destination accounts number");
        }

        System.out.println("Validation of source account " + sourceAccountNumber + " and destination account " +
                destinationAccountNumber + " successful.");

    }
}
