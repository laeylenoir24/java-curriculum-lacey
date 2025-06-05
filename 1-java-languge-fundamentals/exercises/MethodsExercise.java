public class methodsExercise {

    /* 1. Define and Call a Simple Method */
    // Create a method called printWelcomeMessage() that prints:
    // Welcome to the Java Methods Exercise!
    // Steps:
    // 1. Define a method called printWelcomeMessage (it should not return anything).
    // 2. Inside the method, print the welcome message.
    // 3. Call this method inside main.

    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Java Methods Exercise!");
    }

    public static void main(String[] args) {
        printWelcomeMessage();
    }
}


    /* 2. Area of a Rectangle Method */
    // Create a method named areaOfRectangle() to return the area of a rectangle
    // For parameters, it should take a double for width and a double for height
    // the method should return a double
    // return width * height

    public static double areaOfRectangle( double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        double width = 5.0;
        double height = 3.5;
        double area = areaOfRectangle(width, height);
        System.out.println("Area of the rectangle: " + area);
    }

    /* 3. Area of a Square Method */
    // Create a method named areaOfSquare() to return the area of a square
    // For parameters, it should take a double sideLength
    // the method should return a double
    // return side * side

    public static double areaOfSquare(double sideLength) {
        return sideLength + sideLength;
    }

    public static void main(String[] args) {
        double side = 4.0;
        double area = areaOfSquare(side);
        System.out.println("Area of the square: " + area);
    }


    /* 4. Convert Celsius to Fahrenheit */
    // Create a method convertToFahrenheit() that takes a Celsius value and returns the
    // Fahrenheit equivalent.
    // Formula:
    // Fahrenheit = (Celsius * 9/5) + 32
    // Steps:
    // 1. Define a method convertToFahrenheit(double celsius).
    // 2. The method should return the Fahrenheit value.
    // 3. Call the method in main with different values and print the results.

    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = convertToFahrenheit(celsius);
        System.out.println(celsius + " C is equal to " + fahrenheit + "F");
    }


    /* 5. Check If a Number is Even or Odd */
    // Create a method isEven() that returns true if a number is even, and false if odd.
    // Steps:
    // 1. Define a method isEven(int number).
    // 2. Use an if statement to check if the number is even.
    // 3. Return true if even, false otherwise.
    // 4. Call the method in main with different numbers and print the results.

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 7;
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }


    /* 6. Print a String Multiple Times */
    // Create a method printMultipleTimes that prints a string n times.
    // Steps:
    // 1. Define a method printMultipleTimes(String text, int times).
    // 2. Use a for loop to print the text multiple times.
    // 3. Call the method in main with different values.

    public static void printMultipleTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printMultipleTimes("This message", 7);
    }


    // 7. Method Overloading (Greeting Message)
    // Create two overloaded methods named greet().
    // Steps:
    // 1. Method 1: greet(String name)          → Prints "Hello, [name]!"
    // 2. Method 2: greet(String name, int age) → Prints "Hello, [name]!
    //                                            You are [age] years old."
    // 3. Call both methods in main with different arguments.

    public static void greet() {
        System.out.println("Hello!");
    }

    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        greet();
        greet("Alice", 30);
    }


    // 8. Count Vowels in a String Method
    // Create a method countVowels that returns the number of vowels in a given string.
    // Steps:
    // 1. Define a method countVowels(String text).
    // 2. Use a for loop and if statements to count vowels (a, e, i, o, u).
    // 3. Return the count.
    // 4. Call the method in main and print the result for "hello world" and "java programming".
    // Hint: Could use .substring() to check each character

    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i< text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "This message";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in\"" + input + "\":" + vowelCount);
    }


    /* 9. Transaction Report Method */
    // Create a method named transactionReport() to print data representing transactions
    // For parameters, it should have a String array itemNames, an int array itemCounts, and a double array itemCosts.
    // The method shouldn't return a value
    // transactionReport() will take in parallel arrays representing a list of line item transactions
    //      itemNames - the names of each item
    //      itemCounts - the number of an item bought
    //      itemCosts - the price of an individual item
    //
    // For each line item, print the name, item count, price, and line item total
    // Print a summary at the end for the total price of all items sold
    // Hint: Be sure to test your code in main as you add to this method.
    // Hint: Might be worth breaking this into multiple methods. Examples:
    //      * method to take a name, count, price and print out one line that is well formatted
    //          maybe return the total for that line?
    //      * method to print the title and report header
    //      * method to print out the summary section and total
    //
    // Example Output:
    //  -- TRANSACTION REPORT --
    //  ITEM:       | COUNT | PRICE  | TOTAL
    //  Notebook    | 15    | 10.99  | 164.85
    //  Pen         | 20    | 2.95   | 59.00
    //  Whiteout    | 3     | 8.99   | 26.97
    //  -- SUMMARY --
    //  Transaction Total: $250.82

    public static void main(String[] args) {


        String[] itemNames = {"Notebook", "Pen", "Whiteout"};
        int[] itemCount = {15, 20, 3};
        double[] price = {10.99, 2.95, 8.99};
        // transactionReport(itemNames, itemCount, price);

    }
