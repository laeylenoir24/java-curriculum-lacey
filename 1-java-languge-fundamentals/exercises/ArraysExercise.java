import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {

        /* 1. Initializing Arrays */
        // Initialize an array of Strings to store the titles of up to 10 novels
        // Store the titles of five novels in the first 5 indexes
        // Print out the novels in the array, skipping any nulls.
        //
        // Example Output:
        //
        //  Watership Down
        //  The Three-Body Problem
        //  The Picture of Dorian Gray
        //  The Maltese Falcon
        //  The Stranger

        String[] faveMovies = {"Watership Down" , "The Three-Body Problem" , "The Picture of Dorian Gray" , "The Maltese Falcon" , "The Stranger"};
        System.out.println(Arrays.toString(faveMovies));


        /* 2. Average of an Array */
        // Print the average of the following array of integers to the console
        int[] intArray = {100, 101, 4, 8, 16, 24, 32, 40, 80};

        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        double average = (double) sum / intArray.length;
        System.out.println("Average: " + average);

        // Print the average of the following array of doubles to the console
        double[] doubleArray = {70.4, 80.5, 1100, 52, 12};

        double total = 0;
        for (double num : doubleArray) {
            total += num;
        }
        double dubAverage = (double) sum / doubleArray.length;
        System.out.println("Average: " + dubAverage);


        /* 3. Print Out Common Elements In Two Arrays */
        // Print out any values in arrayOne that exist in arrayTwo
        // The order you print them out doesn't matter, but you shouldn't have the same number print twice
        int[] arrayOne = {1, 7, 1, 2, 4, 5, 6, 7};
        int[] arrayTwo = {7, 1, 4, 4, 5, 8, 1, 1};
        // Example Output:
        //  1 4 5 7

        int[] printed = new int[Math.min(arrayOne.length, arrayTwo.length)];
        int printedCount = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    boolean prevPrinted = false;
                    for (int k = 0; k < printedCount; k++) {
                        if (printed[k] == arrayOne[i]) {
                            prevPrinted = true;
                            break;
                        }
                    }
                    if (!prevPrinted) {
                        System.out.println(arrayOne[i]);
                        printed[printedCount++] = arrayOne[i];
                    }
                }
            }
        }

        /* 4. Shift Elements in Array */
        // using a loop, take all elements in the shiftMe Array and shift their indexes by 2
        // fill in the empty spaces in indices 0 and 1 with zeroes
        // print all values in the shiftMe array to the console
        // Example Output:
        //  0
        //  0
        //  -21015
        //  17
        //  0
        //  42
        //  -8
        //  0
        //  0
        //  0

        int[] shiftMe = new int[10];
        shiftMe[0] = -21015;
        shiftMe[1] = 17;
        shiftMe[2] = 0;
        shiftMe[3] = 42;
        shiftMe[4] = -8;

    for (int i = shiftMe.length - 1; i >= 2; i--) {
    shiftMe[i] = shiftMe[i - 2];

    shiftMe[0] = 0;
    shiftMe[1] = 1;

    for (int k = 0; k < shiftMe.length; k++) {
        System.out.println("shiftMe[" + k + "] = " + shiftMe[i]);
    }
    }
}

        /* 5. Remove Duplicate Elements */
        // Given an array containing duplicate values,
        // initialize a new array that contains only values that occur multiple times in the original array
        // print out all values of the new array
        int[] removeDuplicates = {1, 0, 7, 1, 2, 4, 5, 6, 7, 7, 1, 4, 4, 5, 8, 1, 1};
        // Example Output:
        //  1
        //  7
        //  4
        //  5


        /* 6. Arrays and User Input (Transaction Calculator 2.0) */
        // Practice managing multiple arrays
        // Create a loop that will allow a user to add up to 10 line items, prompting for each of the following:
        //      Ask number of an item to purchase
        //      Ask for the price per item
        //
        // Have a way for the user to stop adding items
        // Print the total of all line items
        // Hint: You can use the String.format() or System.out.printf() methods to do basic rounding for this problem
        //
        // Example Output:
        //  Enter the number of items: 8
        //  Enter the cost per item: 14.95
        //  Enter more items?: y
        //  Enter the number of items: 1
        //  Enter the cost per item: 9.99
        //  Enter more items?: y
        //  Enter the number of items: 3
        //  Enter the cost per item: 199.99
        //  Enter more items?: n
        //  Total Cost: $729.56
    }


// new push
