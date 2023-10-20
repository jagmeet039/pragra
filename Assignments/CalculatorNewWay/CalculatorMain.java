package Assignments.CalculatorNewWay;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorMethods calculate = new CalculatorMethods(10,20);

        System.out.println(calculate.add());
        System.out.println(calculate.subtract());
        System.out.println(calculate.multiply());
        System.out.println(calculate.divide());
    }
}
