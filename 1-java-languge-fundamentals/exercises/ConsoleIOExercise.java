import java.util.Scanner;

public class ConsoleIOExercise {
    public static void main(String[] args) {

        /* 1. initialize a Scanner object that you will be using throughout this exercise */
        // Hint: Make sure you add an import statement at the top of this exercise to use the Scanner

        Scanner scanner = new Scanner(System.in);

        /* 2. Dog Years */
        // Ask the user to enter their age
        // Print to the console the user's age in dog years (user's age * 7)
        //
        // Example Output:
        //  What is your age: 28
        //  You would be 196 in dog years.

        System.out.println("What is your age: ");
        int age = scanner.nextInt();

        int dogYears = age * 7;
        System.out.println("You would be " + dogYears + " in dog years.");




        /* 3. Character Replace */
        // Ask the user to enter some text
        // Prompt the user to enter a String they want to replace
        // Prompt the user to enter a String to use instead
        // Print to the console the initial text they entered along with the requested replacements
        //
        // Example Output:
        //  Enter some text: here is some text
        //  What do you want to replace? e
        //  What do you want to replace "e" with? o
        //  Your old text: here is some text
        //  Your new text: horo is somo toxt

        System.out.println("Enter some text: ");
        String originalText = scanner.nextLine();

        System.out.println("What do you want to replace? ");
        String toReplace = scanner.nextLine();

        System.out.println("Enter your replacement letter/word: ");
        String replacement = scanner.nextLine();

        String repText = originalText.replace(toReplace, replacement);

        System.out.println("\nOriginal Text: " + originalText);
        System.out.println("\nUpdated Text: " + repText);



        /* 4. Transaction Calculator */
        // Ask number of items to purchase
        // Ask price per item
        // Ask for sales tax
        // Print the total
        // Hint: You can use the String.format() or System.out.printf() methods to do basic rounding for this problem
        //
        // Example Output:
        //  Enter the number of items: 7
        //  Enter the cost per item: 14.95
        //  Enter the sales tax: 8.25
        //  Total Cost: $113.28

        System.out.println("Enter the number of items: ");
        int quantity = scanner.nextInt();

        System.out.println("Enter the cost per item: ");
        double costPerItem = scanner.nextDouble();

        System.out.println("Enter the sales tax percentage: ");
        double salesTaxPercent = scanner.nextDouble();

        double subtotal = quantity * costPerItem;
        double taxAmount = subtotal * (salesTaxPercent / 100);
        double total = subtotal + taxAmount;

        System.out.println("Total cost: " + total);


        /* 5. String Extraction */
        // Ask the user to enter some text
        // Prompt the user to enter a number
        // Print to console the text the user entered truncated to the number of digits they specified
        //
        // Example Output:
        //  Enter some text: Is this text fine?
        //  Enter a number: 9
        //  The start of your text is: Is this t

        System.out.println("Enter some text: ");
        String inputText = scanner.nextLine();

        System.out.println("Enter a number: ");
        int numChoice = scanner.nextInt();

        if (numChoice > inputText.length()) {
            System.out.println("Hey, that entry is longer than the text length. Here's your full text: ");
            System.out.println(inputText);
        } else {String truncatedTxt = inputText.substring(0,numChoice);
            System.out.println("Truncated text: " + truncatedTxt);
        }


        /* 6. String Methods */
        // Prompt the user for a line of text
        // Demonstrate the use of various String methods:
        // - length of the string
        // - convert to uppercase
        // - convert to lowercase
        // - trim whitespace
        //
        // Example Output:
        //  Enter some text:    Example Text
        //  Your text           :    Example Text
        //  Length of your text : 15
        //  In uppercase        :    EXAMPLE TEXT
        //  In lowercase        :    example text
        //  Your text trimmed   : Example Text

        System.out.println("Enter some text: ");
        String input = scanner.nextLine();

        System.out.println("Your text: \"" + input + "\"");
        System.out.println("Length of your text: " +input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Trimmed text: \"" + input.trim() + "\"");

        scanner.close();
    }
}

//new push