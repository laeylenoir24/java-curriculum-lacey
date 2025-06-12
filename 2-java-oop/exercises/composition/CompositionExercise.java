package composition;

import java.util.Scanner;

public class CompositionExercise {
    public static void main(String[] args) {
        Budget budget = new Budget();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("*Budget Menu*");
            System.out.println("1. Add income");
            System.out.println("2. Add expense");
            System.out.println("3. Print budget");
            System.out.println("4. Exit");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Add income");
                System.out.println("Description: ");
                String incomeDescription = scanner.nextLine();

                System.out.println("Enter income amount: ");
                double incomeAmount = Double.parseDouble(scanner.nextLine());

                BudgetItem incomeItem = new BudgetItem(incomeDescription, incomeAmount);
                budget.addIncome(incomeItem);
                System.out.println("Income added.");

            } else if (input.equals("2")) {
                System.out.println("Add expense");
                System.out.println("Description: ");
                String expenseDescription = scanner.nextLine();

                System.out.println("Enter expense amount: ");
                double expenseAmount = Double.parseDouble(scanner.nextLine());

                BudgetItem expenseItem = new BudgetItem(expenseDescription, expenseAmount);
                budget.addExpense(expenseItem);
                System.out.println("Expense added");

            } else if (input.equals("3")) {
                System.out.println("Budget Summary");
                budget.printBudgetSummary();

            } else if (input.equals("4")) {
                running = false;
                System.out.println("Happy Spending!");

            } else {
                System.out.println("Invalid entry. Try again");

            }
        }

        scanner.close();

    }
}
