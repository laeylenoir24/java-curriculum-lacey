package inheritance;

public class StudentClass extends InheritanceClass.Person {
    private String studentGrade;

    public StudentClass(String name, int socialSec, String location) {
        super(name, socialSec, location);
        this.studentGrade = studentGrade;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "studentGrade='" + studentGrade + '\'' +
                '}';
    }
}
