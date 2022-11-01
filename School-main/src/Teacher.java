import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    List<String> subjects;
    private final String initials;
    private double salary;

    public Teacher(int id, String name, String initials) {
        super(id, name);
        this.initials = initials;
        subjects = new ArrayList<>();
    }

    public List<String> getSubjects() {
            return subjects;
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %-6s %-12s", super.toString(), getInitials(), getSubjects().get(0));
    }

}
