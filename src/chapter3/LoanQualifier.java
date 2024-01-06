package chapter3;

import java.util.Scanner;

/*
NESTED IFS:
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args) {

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we don't know
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with the company: ");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision - Output
        if (salary >= requiredSalary) {
            if (years >= 2) {
                System.out.println("Congrats! You're qualified for a loan.");
            } else {
                System.out.println("Sorry, you must have worked at your current job "
                        + requiredYears + " years.");
            }
        } else {
            System.out.println("Sorry,you must earn at least "
                    + requiredSalary + " to qualify for a loan.");
        }
    }
}
