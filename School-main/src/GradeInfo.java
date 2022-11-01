public class GradeInfo {

    private final String subject;
    private final int grade;

    public GradeInfo(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%-4s %-4s", getSubject(), getGrade());
    }

}
