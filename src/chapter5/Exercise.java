package chapter5;

import java.util.Scanner;

/*
PHONE BILL CALCULATOR
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
Create separate methods to calculate the tax, overage fess, and final total.
Print the itemized bill.
 */
public class Exercise {

    static Scanner scanner = new Scanner(System.in);
    static double minutePrice = 0.25;
    static double taxPercentage = 0.15;

    public static void main(String[] args) {
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        scanner.close();

        double overageFees = calculateOverageFess(overageMinutes);
        double subtotalTax = calculateTax(baseCost, overageFees);
        double finalTotal = calculateFinalTotal(baseCost, overageFees, subtotalTax);

        printReceipt(baseCost, overageFees, subtotalTax, finalTotal);
    }

    public static double calculateOverageFess(double overageMinutes) {
        return overageMinutes * minutePrice;
    }

    public static double calculateTax(double baseCost, double overageFees) {
        return (baseCost + overageFees) * taxPercentage;
    }

    public static double calculateFinalTotal(double baseCost, double overageFees, double subtotalTax) {
        return baseCost + overageFees + subtotalTax;
    }

    public static void printReceipt(double baseCost, double overageFees, double subtotalTax, double finalTotal) {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overageFees));
        System.out.println("Tax: $" + String.format("%.2f", subtotalTax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
