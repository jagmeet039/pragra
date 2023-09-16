package Sep16;

import java.util.Scanner;

public class CalcUsingSwtich {
    public static void main(String[] args) {
        System.out.println("Welcome to my Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("--------------");
        System.out.println("For Sep09.Addition Enter       : 1");
        System.out.println("For Subtraction Enter    : 2");
        System.out.println("For Division Enter       : 3");
        System.out.println("For Multiplication Enter : 4");
        System.out.println("--------------");

        System.out.print("Enter Your Input: ");
        int operation = sc.nextInt();


        switch (operation){
            case 1 :
                double sum = num1 + num2;
                System.out.println("Sum Result: " + sum);
                break;
            case 2 :
                double diff = num1 + num2;
                System.out.println("Subtraction Result: " + diff);
                break;
            case 3 :
                double multi = num1 + num2;
                System.out.println("Multiplication Result: " + multi);
                break;
            case 4 :
                double div = num1 + num2;
                System.out.println("Division Result: " + div);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
