package interfaces;

import java.util.Scanner;

public class Locker {
    private String lockerId;
    private boolean isOccupied;
    private String contents;
    private String lockerPin;

    public Locker(String lockerId, String lockerPin) {
        this.lockerId = lockerId;
        this.lockerPin = lockerPin;
        this.isOccupied = false;
        this.contents = "";
    }

    public Locker(int lockerID) {

    }

    public String getLockerId() {
        return lockerId;
    }

    public void setLockerId(String lockerId) {
        this.lockerId = lockerId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getLockerPin() {
        return lockerPin;
    }

    public void setLockerPin(String lockerPin) {
        this.lockerPin = lockerPin;
    }

    public void storeItem(String item) {
        this.contents = item;
        this.isOccupied = true;
    }

    public void removeItem() {
        this.contents = "";
        this.isOccupied = false;
    }

    @Override
    public String toString() {
        return "Locker {" +
                "Locker ID: " + lockerId + '\'' +
                ", Is Occupied: " + isOccupied +
                ", Contents: '" + contents + '\'' +
                ", PIN: " + lockerPin +
                '\'' + '}';
    }

    public Object getIdLockerAsString() {
        return null;
    }


    static class InputHelper {
        private static final Scanner scanner = new Scanner(System.in);

        public static String getString(String prompt) {
            System.out.print(prompt);
            return scanner.nextLine();
        }

        public static int getInt(String prompt){
            while (true) {
                try {
                    System.out.print(prompt);
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        public static int geInt(String prompt, int min, int max) {
            while (true) {
                int value = getInt(prompt);
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.printf("Please enter a number between %d and %d.%n", min, max);
                }
            }
        }

        public static double getDouble(String prompt) {
            while (true) {
                try {
                    System.out.print(prompt);
                    return Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Pleas enter a decimal number.");
                }
            }
        }

        public static double getDouble(String prompt, int rounding) {
            while (true) {
                double value = getDouble(prompt);
                double scale = Math.pow(10, rounding);
                return Math.round(value * scale) / scale;
            }
        }

        public static boolean getBoolean(String prompt) {
            while (true) {
                System.out.print(prompt + "(yes / no): ");
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.equals("yes") || input.equals("y") || input.equals("true")) {
                    return true;
                } else if (input.equals("no") || input.equals("n") || input.equals("false")) {
                    return false;
                } else {
                    System.out.println("Invalid input. Please enter yes or no.");
                }

                scanner.close();

            }
        }
    }
}
