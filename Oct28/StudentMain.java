package Oct28;

public class StudentMain {
    public static void main(String[] args) {
        Student<Integer, String> student = new Student<>(123, "Jagmeet");

        Integer id = student.getId();
        String name = student.getName();

        System.out.println(id);
        System.out.println(name);
    }
}
