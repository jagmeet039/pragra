package Sep16;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to my Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("--------------");
        System.out.println("For Sep09.Addition Enter : 1");
        System.out.println("For Subtraction Enter    : 2");
        System.out.println("For Division Enter       : 3");
        System.out.println("For Multiplication Enter : 4");
        System.out.println("--------------");

        System.out.print("Enter Your Input: ");
        int operation = sc.nextInt();


        if(operation == 1){
            System.out.print("Sum Result: ");
            System.out.println(num1 + num2);
        }else if(operation == 2){
            System.out.print("Diff Result: ");
            System.out.println(num1 - num2);
        }else if(operation == 4){
            System.out.print("Multi Result: ");
            System.out.println(num1 * num2);
        }else if(operation == 3){
            System.out.print("Div Result: ");
            System.out.println(num1 / num2);
        }else{
            System.out.println("Invalid Input");
        }
    }
}
