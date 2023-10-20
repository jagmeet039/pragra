package Oct07;

public class Student {

    String name;
    int rollno;

    Student(int defaultRollNo){
        name = "default";
        rollno = defaultRollNo;
    }

    Student(String studentName, int studentRollNo){
        name = studentName;
        rollno = studentRollNo;
    }

    public void display(){
        System.out.println(name + rollno);
    }
}
