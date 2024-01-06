package chapter3;

import java.util.Scanner;

/*
Have a user enter their grade, and using a switch statement,
print out a message letting them know they did.
 */
public class TestResultsSwitchCase {
    public static void main(String[] args) {

        //Get the test score
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent!";
            case "B" -> "Very Good!";
            case "C" -> "Good!";
            case "D" -> "Bad!";
            case "F" -> "FAIL!";
            default -> "Error. Invalid grade.";
        };

        //Determine the letter grade
        System.out.println(message);
    }
}
