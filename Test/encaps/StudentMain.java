package Test.encaps;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(123,"Jagmeet","xyz");

        System.out.println(student.getId());

        student.setId(98);

        System.out.println(student.getId());


    }
}
