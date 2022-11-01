import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        printPeople();
    }

    public static void printPeople() {

        Person hans = new Person(100,"Hans Nielsen");
        hans.setEmail("hni@easb.dk");

        Person niels = new Person(101,"Niels Hansen");
        niels.setEmail("nha@easv.dk");

        Person ib = new Person(102,"Ib Boesen");
        ib.setEmail("ibo@easb.dk");

        Teacher bent = new Teacher(202, "Bent H. Pedersen", "bhp");
        bent.setEmail("bhp@easv.dk");
        bent.addSubject("Programming");

        Teacher bo1 = new Teacher(203, "Bo Larsen", "bla");
        bo1.setEmail("bla@easv.dk");
        bo1.addSubject("Physics");

        Student bo2 = new Student(105, "Bo Ibsen", "CS");
        bo2.setEmail("bib@easv.dk");
        bo2.addGrade(new GradeInfo("SCO",12));
        bo2.addGrade(new GradeInfo("SDE",7));
        bo2.addGrade(new GradeInfo("ITO",7));

        ArrayList<Person> people = new ArrayList<>();
        people.add(hans);
        people.add(niels);
        people.add(ib);
        people.add(bent);
        people.add(bo1);
        people.add(bo2);

        for (Person p : people) {
            System.out.println(p);
        }

    }
}