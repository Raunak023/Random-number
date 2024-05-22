import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the world of guessing! Where numbers hide and players seek!");
        System.out.println("Time to play the numbers game! Choose your lucky number between 1 and 100!");

        while (attempts <= 5) { 
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations,You are Right!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is so low, it's making the ants jealous! Aim for the stars!");
            } else {
                System.out.println("Your guess is so high, it's touching the clouds! Aim lower!");
            }
            
            if (attempts < 5) {
                System.out.println("You have " + (5 - attempts) + " attempt(s) left.");
                System.out.println("Take another swing:");
            }
        }

        if (attempts == 5) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + numberToGuess);
        }

        scanner.close();
    }
}
