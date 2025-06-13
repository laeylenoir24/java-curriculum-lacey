package interfaces;
import java.util.Scanner;
import java.util.Random;

public class InterfaceExercise {
    public static void main(String[] args) {

        //I don't know how to fix this.  kept going thinking the next step would resolve
        //the problem and I was able to correct some stuff but I'm having trouble getting
        //my error count to 0
        PinService pinService = new RandomPinService();
        Scanner scanner = new Scanner(System.in);
        LockerManager lockerManager = new LockerManager();

        System.out.println("Generated PIN: " + genPin);

        boolean result = pinService.checkPin(genPin);
        System.out.println("PIN check passed: " + result);

        System.out.println("Personal Locker");
        System.out.println("Renting personal locker ID 100...");
        Object manager = null;
        manager.rentLocker("100");

        System.out.println("Emptying personal locker ID 100...");
        manager.emptyLocker("100");

        System.out.println("**Valet Locker**");
        System.out.println("Renting valet locker ID 200...");
        manager.rentLockertoo("200");

        System.out.println("Emptying valet locker ID 200...");
        manager.emptyLockertoo("200");

        System.out.println(("GOODBYE!"));

    }


}
