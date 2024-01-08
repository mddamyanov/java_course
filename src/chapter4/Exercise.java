package chapter4;

import java.util.Random;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 */
public class Exercise {
    public static void main(String[] args) {

        //Initialize what we know
        int maxRolls = 5;
        int currentSpace = 0;
        int lastSpace = 20;
        int spacesLeft;
        Random random = new Random();

        //Roll the dice
        for (int i = 1; i <= maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.println("Roll #" + i + ": You've rolled a " + die + ".");

            if (currentSpace == lastSpace) {
                System.out.println("Congrats! You won.");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            } else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println("You didn't get to " + lastSpace + " spaces. You lose!");
            } else {
                spacesLeft = lastSpace - currentSpace;
                System.out.println("You are now on space " + currentSpace + " and have " + spacesLeft + " more to go.");
            }
            System.out.println();
        }
    }
}
