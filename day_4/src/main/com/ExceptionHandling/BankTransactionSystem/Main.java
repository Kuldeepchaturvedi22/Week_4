package com.ExceptionHandling.BankTransactionSystem;

import java.util.Scanner;

public class Main {

    // Method to withdraw amount from account balance
    public static double withdraw(double amount, double accountBalance) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount > accountBalance) {
            // Throw custom exception if withdrawal amount exceeds balance
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if (amount < 0) {
            // Throw IllegalArgumentException if the amount is negative
            throw new IllegalArgumentException("Invalid amount!");
        }
        return accountBalance - amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 0;
        System.out.println("Current account balance is: " + accountBalance);
        System.out.println("Enter deposit amount: ");
        accountBalance += scanner.nextDouble();
        System.out.println("Current account balance is: " + accountBalance);
        System.out.println("Enter withdrawing amount: ");
        double withdrawingAmount = scanner.nextDouble();
        try {
            // Try to withdraw the amount and print the new balance
            System.out.println("Withdrawal successful, new balance: " + withdraw(withdrawingAmount, accountBalance));
        } catch (InsufficientBalanceException e) {
            // Handle insufficient balance exception
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle invalid amount exception
            System.out.println(e.getMessage());
        }
    }
}
