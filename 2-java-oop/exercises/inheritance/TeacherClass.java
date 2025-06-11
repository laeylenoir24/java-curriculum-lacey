package inheritance;

public class TeacherClass extends FacultyClass{
    private String subjectTaught;
    private int yearsEmployed;

    public TeacherClass(String name, int socialSec, String location, double payRate, int employeeId, String subjectTaught, int yearsEmployed) {
        super(name, socialSec, location, payRate, employeeId);
        this.subjectTaught = subjectTaught;
        this.yearsEmployed = yearsEmployed;

    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    public int getYearsEmployed() {
        return yearsEmployed;
    }

    public void setYearsEmployed(int yearsEmployed) {
        this.yearsEmployed = yearsEmployed;
    }

    @Override
    public String toString() {
        double getPayRate = getPayRate() + (yearsEmployed * 100);
        double payRate = 0.0;
        return "Salary{" +
                "Pay Rate" + payRate + '\'' +
                " + (years employed " + yearsEmployed + '\'' +
                "* 100)" + '\'';





    }
}
