import java.util.Scanner;
import java.util.Random;

public class JavaSummative {
    private static final int totalLockers = 10;
    private static final int pinLength = 4;
    private static final int maxPin = (int) Math.pow(10, pinLength);
    private static String[] lockers = new String[totalLockers];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLocker System - Main Menu");

            boolean lockersAvail = hasAvailLocker();
            int optionNumber = 1;

            if (lockersAvail) {
                System.out.println(optionNumber++ + ". Rent a locker");
            }

            System.out.println(optionNumber++ + ". Open a locker");
            System.out.println(optionNumber++ + ". Release a locker");
            System.out.println(optionNumber + ". Exit");

            System.out.println("Select an option: ");
            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);
                int rentOpt = lockersAvail ? 1 : -1;
                int openOpt = lockersAvail ? 2 : 1;
                int releaseOpt = lockersAvail ? 3 : 2;
                int exitOpt = lockersAvail ? 4 : 3;

                if (choice == rentOpt && lockersAvail) {
                    rentLocker();
                } else if (choice == openOpt) {
                    openLocker(scanner);
                } else if (choice == releaseOpt) {
                    releaseLocker(scanner);
                } else if (choice == exitOpt) {
                    System.out.println("Exiting...");
                    return;
                } else {
                    System.out.println("Invalid option");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number");
            }
        }
    }
    private static void rentLocker() {
        for (int i = 0; i < totalLockers; i++) {
            if (lockers[i] == null) {
                String pin = generatePin();
                lockers[i] = pin;
                System.out.println("Locker " + (i + 1) + "rented. PIN: " + pin);
                return;
            }
        }
        System.out.println("No lockers available.");
    }

    private static void openLocker(Scanner scanner) {
        int lockerNum = promptLockerNum(scanner);
        if (!isValidLockerNum(lockerNum))
            return;

        if (locker[lockerNum - 1] == null) {
            System.out.println("Locker is not currently rented.");
            return;
        }

        String pin = promptPin(scanner);
        if (lockers[lockerNum - 1].equals(pin)) {
            System.out.println("Locker " + lockerNum + " opened.");
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    
}
