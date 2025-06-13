package interfaces;

import java.util.Scanner;

public class PersonalLocker extends Locker implements PinService{
    public PersonalLocker(int lockerID) {
        super(lockerID);

    }


    @Override
    public String getNewPin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new pin for your locker: ");
        String inputPin = scanner.nextLine();

        while (!inputPin.matches("\\d{4}")) {
            System.out.println("Invalid input. Please enter a 4 digit pin.");
            inputPin = scanner.nextLine();
        }

        setPin(inputPin);
        return "Pin successfully set.";
    }

    private void setPin(String inputPin) {

    }

    @Override
    public boolean checkPin(String inputPin) {
        return inputPin.equals(pin);
    }

    public boolean checkPin() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter your pin: ");
            String enteredPin = scanner.nextLine();

            if (enteredPin.equals(pin)) {
                return true;
            } else {
                attempts--;
                System.out.println("Incorrect pin. Attempts remaining: " + attempts);
            }
        }

        System.out.println("Access denied. Try again later.");
        return false;
    }




}
