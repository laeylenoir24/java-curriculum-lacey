package interfaces;

import java.util.Scanner;
import java.util.Random;

public class ValetLocker extends Locker implements PinService{
    String pin;

    public ValetLocker(int lockerId) {
        super(lockerId);
    }

    @Override
    public String getNewPin() {
        Random random = new Random();
        int pinNumber = 1000 + random.nextInt(9000);
        String pin;
        this.pin = String.valueOf(pinNumber);

        String lockerId = null;
        return "Reciept:\nLocker ID:" + lockerId + "\nPIN: " + pin;
    }

    @Override
    public boolean checkPin(String inputPin);

    {
        return input.equals(pin) || inputPin.equalsIgnoreCase("Override");
    }

    public boolean checkPin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PIN or type OVERRIDE");

        if (checkPin(input)) {
            return true;
        } else {
            System.out.println("Incorrect PIN.");
            return false;
        }
    }


}
