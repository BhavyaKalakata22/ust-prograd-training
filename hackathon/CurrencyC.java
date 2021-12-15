package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ConverterC {

    public static void main(String[] args) throws IOException {
        Currency currency = new Currency();
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Program Started...");
        while (true) {
            System.out.println("1.INR To USD");
            System.out.println("2.USD To INR");
            System.out.println("3.INR To AUD");
            System.out.println("4.AUD To INR");
            System.out.println("5.INR To CAD");
            System.out.println("6.CAD To INR");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Enter Amount in INR");
                logger.info("user choosed to convert INR-USD");
                double amountInRupees = sc.nextDouble();
//                if (amountInRupees < 0)
//                {
//                    throw new IllegalArgumentException("amount cannot be negative");
//                }
//                else
                System.out.printf("%.2f", currency.rupeesToDollar(amountInRupees));
            }
            if (choice == 2) {
                System.out.println("Enter Amount in USD");
                double amountInUSD = sc.nextInt();
                logger.info("user choosed to convert USD-INR");
                if (amountInUSD < 0) {
                    throw new IllegalArgumentException("amount cannot be negative");
                } else
                    System.out.printf("%.2f", currency.dollarToRupees(amountInUSD));
            }
            if (choice == 3) {
                System.out.println("Enter Amount in INR to convert it to AUD");
                double amountInINR = sc.nextInt();
                logger.info("user choosed to convert INR-AUD");
                if (amountInINR < 0)
                    throw new IllegalArgumentException("Amount cannot be negative");
                else
                    System.out.printf("%.2f", currency.rupeesToAustralianDollar(amountInINR));
            }
            if (choice == 4) {
                System.out.println("Enter Amount in AUD");
                double amountInAUD = sc.nextInt();
                logger.info("user choosed to convert AUD-INR");
                if (amountInAUD < 0)
                    throw new IllegalArgumentException("Amount cannot be negative");
                else
                    System.out.printf("%.2f", currency.australianDollarToRupess(amountInAUD));
            }
            if (choice == 5) {
                System.out.println("Enter Amount in INR to convert it to CAD");
                double amountInINR = sc.nextInt();
                logger.info("user choosed to convert INR to CAD");
                if (amountInINR < 0)
                    throw new IllegalArgumentException("Amount cannot be negative");
                else
                    System.out.printf("%.2f", currency.rupeesToCanadianDollar(amountInINR));
            }
            if (choice == 6) {
                System.out.println("Enter Amount in CAD");
                double amountInCAD = sc.nextInt();
                logger.info("user choosed to convert CAD-INR");
                if (amountInCAD < 0)
                    throw new IllegalArgumentException("Amount cannot be negative or zero");
                else
                    System.out.printf("%.2f", currency.canadianDollarToRupees(amountInCAD));
            }


            logger.info("Program Stopped");
        }
    }

}