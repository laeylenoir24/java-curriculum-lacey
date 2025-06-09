import java.util.Scanner;

public class ExceptionExercise {
    /*

        ● If the user enters a valid age, email, and PIN, the program should display
        "Registration Successful!"
        ● If the user enters an invalid age or PIN, the program should display an error
        message and ask them to try again.
        ● If the user enters a null or empty email, the program should notify them.
        ● Regardless of errors, a "Registration Attempt Complete!" message should
        always be printed at the end.
    */
    /*
        Bonus Challenge:
        ● Use a loop to allow the user to retry entering the age or PIN if an error occurs.
        ● Allow only numbers for the PIN and ensure it is exactly 4 digits
     */

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String email = "";
        int age = 0;
        String pin = "";

        while (email == null || email.isEmpty()) {
            System.out.println("Enter your email: ");
            email = scanner.nextLine();
            if (email == null || email.isEmpty()) {
                System.out.println("Error: Email cannot be empty or null. Try again.");
            }
        }

        while (true) {
            System.out.println("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = (scanner.nextInt());
                if (age >= 18) {
                    break;

                } else {
                    System.out.println("Error: Age must be at least 18. Try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Enter a number for age.");
                scanner.next();
            }
        }

        scanner.nextLine();
        while (true) {
            System.out.println("Enter your 4 digit PIN.");
            pin = scanner.nextLine();

            if (pin.length() == 4 && pin.matches("\\d{4}")) {
                break;
            } else {
                System.out.println("Error: PIN must be 4 digits and only contain numbers.");
            }
        }

        System.out.println("Registration successful!");

        System.out.println("Registration attempt complete!");
        scanner.close();
    }

}

