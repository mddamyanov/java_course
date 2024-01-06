package chapter3;

import java.util.Scanner;

/*
The objective of the games is to enter enough change to equal exactly $1!
Create a program that asks a user to enter the quantities for the following coins:
pennies, nickels, dimes, and quarters.
Your program should count up the value of all the change.
If it's exactly $1, they win!
If it's more than $1, tell them by how much they went over.
If it's less than $1, tell them by how much they went under.
Feel free to change the game for your country's currency!
 */
public class Exercise {
    public static void main(String[] args) {

        //Initialize what we know
        double penniesValue = 0.01;
        double nickelsValue = 0.05;
        double dimesValue = 0.10;
        double quartersValue = 0.25;
        double totalValue = 1.00;

        //Get what we don't know
        System.out.println("Enter pennies:");
        Scanner scanner = new Scanner(System.in);
        int penniesCount = scanner.nextInt();

        System.out.println("Enter nickels:");
        int nickelsCount = scanner.nextInt();

        System.out.println("Enter dimes:");
        int dimesCount = scanner.nextInt();

        System.out.println("Enter quarters:");
        int quartersCount = scanner.nextInt();

        //Output
        double sumValue = (penniesValue * penniesCount)
                + (nickelsValue * nickelsCount)
                + (dimesValue * dimesCount)
                + (quartersValue * quartersCount);

        double needValue = totalValue - sumValue;
        double exceedValue = sumValue + totalValue;
        if (sumValue == totalValue) {
            System.out.println("Congrats! You win!");
        } else if (sumValue < totalValue) {
            System.out.println("Sorry, you need more " + needValue + "$.");
        } else if (sumValue > totalValue) {
            System.out.println("Sorry, you exceed with " + exceedValue + "$.");
        } else {
            System.out.println("Wrong Input!");
        }
    }
}
