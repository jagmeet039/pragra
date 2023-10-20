package Oct14.Aggregation;

public class StudentMain {
    public static void main(String[] args) {
        FullName fullName = new FullName("Jagmeet","Singh","Sidhu");

        Student student = new Student(fullName, 123);

        System.out.println(student);

    }
}
