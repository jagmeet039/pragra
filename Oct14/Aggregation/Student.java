package Oct14.Aggregation;

public class Student {
    FullName name;
    int id;

    public Student(FullName name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
