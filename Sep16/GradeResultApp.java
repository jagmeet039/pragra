package Sep16;

public class GradeResultApp {
    public static void main(String[] args) {
        int marks = 55;

        if(marks < 0){
            System.out.println("Invalid Marks");
        }else if(marks >= 0 && marks < 40){
            System.out.println("Fail");
        }else if(marks >= 40 && marks < 60){
            System.out.println("B Grade");
        }else if(marks >=60 && marks < 80){
            System.out.println("B+ Grade");
        }else if(marks >=80 && marks < 90){
            System.out.println("A Grade");
        }else if(marks >= 90 && marks < 99){
            System.out.println("A+ Grade");
        }else if(marks >=99 && marks <=100){
            System.out.println("You are Alien");
        }else {
            System.out.println("Invalid Marks");
        }
    }
}
