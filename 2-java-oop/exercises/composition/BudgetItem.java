package composition;

public class BudgetItem {
    private String description;
    private double amount;
    private int repeatCount;

    public BudgetItem(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.repeatCount = repeatCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    @Override
    public String toString() {
        return "BudgetItem{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", repeatCount=" + repeatCount +
                '}';
    }
}
