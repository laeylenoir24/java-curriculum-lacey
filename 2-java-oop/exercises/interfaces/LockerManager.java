package interfaces;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class LockerManager {
    private ArrayList<Locker> lockers;

    public LockerManager(){
        lockers = new ArrayList<>();

        for (int i = 100; i < 105; i++) {
            lockers.add(new.PersonalLocker(i));
        }

        for (int i = 200; i < 205; i++) {
            lockers.add(new ValetLocker(i))
        }
    }

    public void rentLocker(String lockerId) {
        Locker locker = findLockerById(lockerId);
        if (locker == null) {
            System.out.println("Locker not found.");
            return;
        }

        if (locker instanceof PinService) {
            PinService pinLocker = (PinService) locker;
            String receipt = pinLocker.getNewPin();
            System.out.println(receipt);

                Scanner scanner = new Scanner(System.in);
            System.out.println("Enter item to store in locker # " + lockerId + ": ");
            String item = scanner.nextLine();
            locker.setContents(item);
            locker.setOccupied(true);

            System.out.println("Item stored.");

            System.out.println("Try again.");
        }
    }

    public void emptyLocker(String lockerId) {
        Locker locker = findLockerById(lockerId);
        if (locker == null) {
            System.out.println("Locker not found.");
            return;
        }

        if (locker instanceof PersonalLocker personalLocker) {
            if (personalLocker.checkPin());
            {
                System.out.println("Contents: " + locker.getContents);
                locker.setOccupied(false);
            } else {
                System.out.println("Access denied.");
            }
            } else if (locker instanceof ValetLocker valetLocker) {
            if (valetLocker.checkPin()) {
                System.out.println("Contents: " + locker.getContents());
                locker.setOccupied(false);
            }

            } else {
                System.out.println("Access denied.");
            } else {
            System.out.println("Try again.");
            }
        }

        private Locker findLockerById(String lockerId) {
            for (Locker locker : lockers) {
                if (locker.getIdLockerAsString().equals(lockerId)) {
                    return locker;
                }
            }

            return null;
    }
}
