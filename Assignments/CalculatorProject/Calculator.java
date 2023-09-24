package Assignments.CalculatorProject;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorMethods calc = new CalculatorMethods();

        System.out.println("Welcome to my Calculator");
        int choice;

        do {
            System.out.println("-------------------------");
            System.out.println("Our Main Menu");
            System.out.println("-------------------------");
            System.out.println("Press 1 : Addition");
            System.out.println("Press 2 : Subtraction");
            System.out.println("Press 3 : Multiplication");
            System.out.println("Press 4 : Division");
            System.out.println("-------------------------");
            System.out.println("Press 5 : Quit");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> calc.additionMenu();
                case 2 -> calc.subtractionMenu();
                case 3 -> calc.multiplicationMenu();
                case 4 -> calc.divisionMenu();
                case 5 -> {
                    System.out.println("-------------------------");
                    System.out.println("Thanks for using our Calculator App ;-)");
                    System.out.println("-------------------------");
                }
                default -> {
                    System.out.println("-------------------------");
                    System.out.println("Ops!! Invalid choice. Please try again.");
                    System.out.println("-------------------------");
                    calc.timerRestart();
                }
            }
        } while (choice != 5);

        sc.close();
    }
}
