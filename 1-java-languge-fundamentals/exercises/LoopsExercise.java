import java.util.Scanner;
import java.util.Random;

public class LoopsExercise {
    public static void main(String[] args) {
        /* 1-FIZZBUZZ (Java Edition) */
        // Write a Python script that generates output according to these rules:
        //
        // Print numbers from 1 to 100.
        // If a number is divisible by 3, print "Fizz" instead of the number.
        // If a number is divisible by 5, print "Buzz" instead of the number.
        // If a number is divisible by both 3 and 5, print "Fizzbuzz" instead of the number.
        //

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        /* 2. Running Total  */
        // We want to create a script that calculates a user's running total of whole numbers. The flow of the script should behave like this:
        // Initialize a variable to store the running total with a value of zero.
        // Start a while loop with the condition that the input is not equal to "Q".
        // Prompt the user for a number or Q to quit.
        // If the user enters "Q" or "q", let the loop end.
        // If the user does not enter "Q", assume it is a whole number, convert it to an integer value, and add it to the running total variable.
        // Display the final total when the loop ends.
        //

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        String input;

        while (true) {
            System.out.println("Enter a whole number of 'Q' to quit: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                total += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a whole number or 'Q' to quit.");
            }
        }

        System.out.println("Final total: " + total);
        scanner.close();


        /* 3. Number Guessing Game (Hot or Cold Edition) */
        // Create a game where the user must correctly guess a secret number.
        // Initialize a variable and set it to a random integer  (example: secret_number = 7)
        // Create a header similar to "--Number Guessing Game--" that displays only at the start of the game
        // Have a loop that continually prompts the user to guess the secret number.
        // If their latest guess is closer to the secret number than their last guess, print "Getting Warmer..."
        // If their latest guess is further away from the secret number, print "Getting Colder..."
        // if it has the same distance, print "About the same temperature..."
        // When the user enters the correct number, congratulate them and end the game.
        // Hint: when calculating distances, a negative number multiplied by -1 is that number's absolute value
        //
        // Example Output:
        //  --Number Guessing Game--
        //  Please guess a number: 10
        //  Guess Again: 15
        //  Getting Colder... Guess Again: 5
        //  Getting Warmer... Guess Again: 4
        //  Getting Colder... Guess Again: 6
        //  Getting Warmer... Guess Again: 8
        //  About the same temperature...Guess Again: 7
        //  Congratulations!

        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int lastGuess = -1;
        int guess;

        System.out.println("--Number Guessing Game--");
        System.out.println("Guess the secret number between 1 and 100!");

        while (true) {
            System.out.println("Guess a number: ");
            try {
                guess = Integer.parseInt(scanner.nextLine());

                if (guess == secretNumber) {
                    System.out.println("Congratulations!");
                    break;
                }

                if (lastGuess == -1) {
                    System.out.println("Keep guessing...");
                } else {
                    int lastDiff = Math.abs(secretNumber - lastGuess);
                    int currentDiff = Math.abs(secretNumber - guess);

                    if (currentDiff < lastDiff) {
                        System.out.println("Getting warmer...");
                    } else if (currentDiff > lastDiff) {
                        System.out.println("Getting colder...");
                    } else {
                        System.out.println("About the same temperature...");
                    }
                }

                lastGuess = guess;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }

        }
    }

    //new push