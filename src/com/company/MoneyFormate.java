package com.company;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-currency-formatter/
public class MoneyFormate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = Double.parseDouble(scanner.nextLine());
        scanner.close();

        // Write your code here.
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        String india = nf.format(payment).replace("$","Rs.");
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
