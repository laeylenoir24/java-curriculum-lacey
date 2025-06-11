package inheritance;

public class FacultyClass extends InheritanceClass {
    private double payRate;
    private int employeeId;

    public FacultyClass(String name, int socialSec, String location, double payRate, int employeeId) {
        super(name, socialSec, location);
        this.payRate = payRate;
        this.employeeId = employeeId;

    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getPay() {
        return 0;
    }
}