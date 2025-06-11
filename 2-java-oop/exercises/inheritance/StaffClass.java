package inheritance;

public class StaffClass extends FacultyClass{
    private double hoursWorked;

    public StaffClass(String name, int socialSec, String location, double payRate, int employeeId, double hoursWorked) {
        super(name, socialSec, location, payRate, employeeId);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        double payRate = 0.0;
        double getPay = payRate * hoursWorked;
        return "Salary{" +
                "hoursWorked: " + hoursWorked +
                " * pay rate: " + payRate + '}';
    }
}
