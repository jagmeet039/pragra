package Assignments.InheritanceOct17.Problem1;

public class Main {
    public static void main(String[] args) {
        Adder addObj = new Adder();
        int input1 = 42;
        int input2 = 13;
        int result = addObj.add(input1,input2);
        addObj.print();
        System.out.println(input1 + " " + input2 + " " + result);
    }
}
