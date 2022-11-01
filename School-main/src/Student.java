import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<GradeInfo> gradeReport;
    private final String education;

    public Student(int id, String name, String education) {
        super(id, name);
        this.education = education;
        gradeReport = new ArrayList<>();
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return education;
    }

    public double getAverageGrade() {
        int total = 0;

        for (GradeInfo gi : gradeReport)
            total += gi.getGrade();

        return (double) total / getGradeReport().size();
    }

    public int getGrade(String subject) {
        return gradeReport.get(gradeReport.indexOf(subject)).getGrade();
    }

    public void addGrade(GradeInfo grade) {
        gradeReport.add(grade);
    }

    @Override
    public String toString() {
        return String.format("%s %-6s %-12.02f", super.toString(), getEducation(), getAverageGrade());
    }

}
