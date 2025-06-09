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

        if (lockers[lockerNum - 1] == null) {
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

    private static void releaseLocker(Scanner scanner) {
        int lockerNum = promptLockerNum(scanner);
        if (!isValidLockerNum(lockerNum)) return;

        if (lockers[lockerNum - 1] == null) {
            System.out.println("Locker is not currently rented.");
            return;
        }

        String pin = promptPin(scanner);
        if (lockers[lockerNum - 1].equals(pin)) {
            System.out.println("Are you sure you want to release this locker? (Yes or No");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("yes")) {
                lockers[lockerNum - 1] = null;
                System.out.println("Locker" + lockerNum + " released.");
            } else {
                System.out.println("Locker release canceled.");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public static String generatePin() {
        Random rand = new Random();
        int pin = rand.nextInt(maxPin);
        return String.format("%0" + pinLength + "d", pin);
    }

    private static boolean hasAvailLocker() {
        for (String pin : lockers) {
            if (pin == null) return true;
        }
        return false;
    }

    private static int promptLockerNum(Scanner scanner) {
        System.out.print("Enter locker number (-1" + totalLockers +"): ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
            return -1;
        }

        }
    private static boolean isValidLockerNum(int num) {
        if (num < 1 || num > totalLockers) {
            System.out.println("Locker number out of range.");
            return false;
        }
        return true;
    }
    private static String promptPin(Scanner scanner) {
        System.out.println("Enter PIN: ");
        return scanner.nextLine();
    }
    }








    

