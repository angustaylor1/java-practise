package com.goose;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

//        Initialize scanner to get data from user
        Scanner scanner = new Scanner(System.in);

//        Get data from user for calculation
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat();
        interestRate = (interestRate / PERCENT) / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double mortgage = principal
                * ((interestRate * (Math.pow(1+interestRate, numberOfPayments)
                / (Math.pow(1+interestRate, numberOfPayments) - 1 ))));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + currency.format(mortgage));
    }
}


// Principal
// Annual Interest rate
//Period (YEars)
// Mortgage