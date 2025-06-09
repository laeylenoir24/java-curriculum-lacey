import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        /* 1. Dog Years V2 */
        // Ask the user to a dog's age (in human years)
        // Print to the console the dog's age in dog years (Hint: one human year is equal to 7 dog years)
        // If the dog's age is under 21, print: "Just a pup!"
        // If the dog's age is above 21 and below 70, print "The IRS is requiring you to pay your dog taxes."
        // if the dog's age is above 70 and below 112, print "Can dogs even retire in this economy?"
        // if the dog's age is above 112, print "Wise ancient dog."

        // Example Output:
        //  What is your age (in human years): 28
        //  You would be 196 in dog years.
        //  Wise ancient dog.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int humanAge = scanner.nextInt();
        int dogAge = 7 * humanAge;

        if (dogAge <= 21) {
            System.out.println("Just a kid!");
        } else if (dogAge <= 69) {
            System.out.println("TheIRS is requiring you to pay your dog taxes.");
        } else if (dogAge <= 112) {
            System.out.println("Can dogs even retire in this economy?");
        } else {
            System.out.println("Wise ancient dog");
        }
            scanner.close();






        /* 2. Transaction Calculator V2 */
        // Ask number of items to purchase
        // Ask price per item
        // Ask if there is a sales tax required for this purchase (y/n)
        // If there is a sales tax required, ask for sales tax
        // Print the total
        // Hint: If you are comparing Strings/Objects, make sure to use the .equals() method
        //
        // Example Output:
        //  Enter the number of items: 7
        //  Enter the cost per item: 14.95
        //  Is a sales tax required for this purchase? (y/n): y
        //  Enter the sales tax: 8.25
        //  Total Cost: $113.28

        //Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numbOfItems = scanner.nextInt();

        System.out.println("Enter price per item: ");
        double costPerItem = scanner.nextInt();
        double salesTax = scanner.nextInt();

        System.out.println("Sales tax required? ");
        boolean taxReq = true;
        boolean taxNone = false;
        double total = costPerItem + salesTax;

        if (taxReq) {
            System.out.println("Enter sales tax: ");
        } else if (taxNone) {
            System.out.println(total);
        }
        scanner.close();







        /* 3. Grade Calculator */
        // Write a Java program that will have the user enter scores for
        // Exercises        (worth 50% of grade)
        // Quizzes          (worth 10% of grade)
        // Midterm Project  (worth 20% of grade)
        // Final Project    (worth 20% of grade)
        // Calculate that person's grade for the course accounting for how much the scores are weighted for the course.
        // Assign a letter based score based on the following table:
        //    A+ 	97–100
        //    A 	93–96
        //    A− 	90–92
        //    B+ 	87–89
        //    B 	83–86
        //    B− 	80–82
        //    C+ 	77–79
        //    C 	73–76
        //    C− 	70–72
        //    D+ 	67–69
        //    D 	63–66
        //    D− 	60–62
        //    F 	0–59
        // Hint: Think carefully about how many if/else statements you actually need
        // Example Output:
        //  Enter Exercises : 90    45
        //  Enter Quizzes   : 95    9.5
        //  Enter Midterm   : 70.5  14.1
        //  Enter Final     : 92    18.4
        //
        //  Final Grade is: 87 (B+)
    }

    System.out.println("Enter your exerises score: ");
    double exercises = scanner.nextDouble();

    System.out.println("Enter your quizzes score: ");
    double quizzes = scanner.nextDouble();

    System.out.println("Enter your Midterm score: ");
    double midterm = scanner.nextDouble();

    System.out.println("Enter your Finals score: ");
    double finals = scanner.nextDouble();

    double weightedScore = (exercises * .50) + (quizzes * .10) + (midterm * .20) + (finals * .20);
    String letterGrade = getLetterGrade(weightedScore);

    System.out.printf("Your weighted grade is: %.2f\n", weightedScore);
    System.out.println("Your letter grade is: " + letterGrade);

    scanner.close;

    public static String getLetterGrade(double grade) {
        if (grade >= 97) {
            return "A+";
        } else if (grade >= 93) {
            return "A";
        } else if (grade >= 90) {
            return "A-";
        } else if (grade >= 87) {
            return "B+";
        } else if (grade >= 83) {
            return "B";
        } else if (grade >= 80) {
            return "B-";
        } else if (grade >= 77) {
            return "C+";
        } else if (grade >= 73) {
            return "C";
        } else if (grade >= 70) {
            return "C-";
        } else if (grade >= 67) {
            return "D+";
        } else if (grade >= 63) {
            return "D";
        } else if (grade >= 60) {
            return "D-";
        } else {
            return "F";
        }
        }
    }



}

