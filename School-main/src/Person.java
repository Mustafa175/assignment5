public class Person {

    private final int id;
    private String name;
    private String email;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-18s %-14s", getId(), getName(), getEmail());
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Person))
            return false;
        Person p = (Person) o;
        return p.getId() == this.id;
    }

}
