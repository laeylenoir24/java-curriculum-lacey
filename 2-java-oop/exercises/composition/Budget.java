package composition;

import java.util.ArrayList;

public class Budget {
    private ArrayList<BudgetItem> income;
    private ArrayList<BudgetItem> expenses;
    private String item;

    public Budget() {
        this.income = new ArrayList<>();
        this.expenses = new ArrayList<>();
    }

    public ArrayList<BudgetItem> getIncome() {
        return income;
    }

    public void setIncome(ArrayList<BudgetItem> income) {
        this.income = income;
    }

    public ArrayList<BudgetItem> getExpenses() {
        return expenses;
    }

    public void setExpenses(ArrayList<BudgetItem> expenses) {
        this.expenses = expenses;
    }

    public void addIncome(BudgetItem incomeItem) {
        income.add(incomeItem);
    }

    public void addExpense(BudgetItem expenseItem) {
        expenses.add(expenseItem);
    }

     public void printBudgetSummary() {
        System.out.println("*Budget Summary*");

        System.out.println("Income: ");
        double totalIncome = 0.0;

        for (BudgetItem item : income) {
            System.out.println(" - " + item);
            totalIncome += item.getAmount();
        }

        System.out.println("Expenses: ");
        double totalExpenses = 0.0;
        for (BudgetItem item : expenses) {
            System.out.println(" - " + item);
            totalExpenses += item.getAmount();
        }

        double net = totalIncome - totalExpenses;

        System.out.print("**End of Year Summary**");
        System.out.println("Total income: " + totalIncome);
        System.out.println("Total expenses: " + totalExpenses);
        System.out.println("Net savings: " + net);
     }
}
