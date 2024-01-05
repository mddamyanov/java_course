package chapter2;

import java.util.Scanner;

/*
Create a program that asks for a season of the year,
then a whole number, then an adjective.
Use the input to complete the sentence below then output the result:
"On a [adjective][season of the year] day, I drink a minimum of [whole number] cups of coffee."
 */
public class Exercise {
    public static void main(String[] args) {
        System.out.println("Enter season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter number of cups:");
        int cups = scanner.nextInt();

        System.out.println("Enter adjective:");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + cups + " cups of coffee.");
    }
}
