package Assignments.CalculatorProject;

import java.util.Scanner;

public class CalculatorMethods {
    Scanner sc = new Scanner(System.in);

    public void timerRestart(){
        try {
            System.out.println("Restarting...");
            Thread.sleep(1000);
        } catch (InterruptedException ignored) { }
    }

    public void timerLoading(){
        try {
            System.out.println("Loading...");
            Thread.sleep(1000);
        } catch (InterruptedException ignored) { }
    }

    public void additionMenu() {
        int choice;
        char additionChoice;
        do {
            timerLoading();
            System.out.println("-------------------------");
            System.out.println("Welcome to Addition Menu");
            System.out.println("-------------------------");
            System.out.println("Press 1 : Add Two Numbers");
            System.out.println("Press 2 : Add Three Numbers");
            System.out.println("-------------------------");
            System.out.println("Press 3 : Exit to Main Menu");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Addition of Two Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        double sumResult = add(num1, num2);
                        System.out.println("-------------------------");
                        System.out.println("Your Addition Result: " + sumResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        additionChoice = sc.next().toLowerCase().charAt(0);
                    } while (additionChoice != 'n');
                }
                case 2 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Addition of Three Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        System.out.print("Enter Number3: ");
                        double num3 = sc.nextDouble();
                        double sumResult = add(num1, num2, num3);
                        System.out.println("-------------------------");
                        System.out.println("Your Addition Result: " + sumResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        additionChoice = sc.next().toLowerCase().charAt(0);
                    } while (additionChoice != 'n');
                }
                case 3 -> {
                    System.out.println("-------------------------");
                    System.out.println("Exiting to Main Menu :-)");
                    System.out.println("-------------------------");
                    timerLoading();
                }
                default -> {
                    System.out.println("-------------------------");
                    System.out.println("Ops!! Invalid choice. Please try again.");
                    System.out.println("-------------------------");
                }
            }
        } while (choice != 3);
    }

    public void subtractionMenu() {
        int choice;
        char subtractionChoice;
        do {
            timerLoading();
            System.out.println("-------------------------");
            System.out.println("Welcome to Subtraction Menu");
            System.out.println("-------------------------");
            System.out.println("Press 1 : Subtract Two Numbers");
            System.out.println("Press 2 : Subtract Three Numbers");
            System.out.println("-------------------------");
            System.out.println("Press 3 : Exit to Main Menu");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Subtraction of Two Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        double subResult = sub(num1, num2);
                        System.out.println("-------------------------");
                        System.out.println("Your Subtraction Result: " + subResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        subtractionChoice = sc.next().toLowerCase().charAt(0);
                    } while (subtractionChoice != 'n');
                }
                case 2 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Subtraction of Three Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        System.out.print("Enter Number3: ");
                        double num3 = sc.nextDouble();
                        double subResult = sub(num1, num2, num3);
                        System.out.println("-------------------------");
                        System.out.println("Your Subtraction Result: " + subResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        subtractionChoice = sc.next().toLowerCase().charAt(0);
                    } while (subtractionChoice != 'n');
                }
                case 3 -> {
                    System.out.println("-------------------------");
                    System.out.println("Exiting to Main Menu :-)");
                    System.out.println("-------------------------");
                    timerLoading();
                }
                default -> {
                    System.out.println("-------------------------");
                    System.out.println("Ops!! Invalid choice. Please try again.");
                    System.out.println("-------------------------");
                }
            }
        } while (choice != 3);
    }

    public void multiplicationMenu() {
        int choice;
        char multiplyChoice;
        do {
            timerLoading();
            System.out.println("-------------------------");
            System.out.println("Welcome to Multiplication Menu");
            System.out.println("-------------------------");
            System.out.println("Press 1 : Multiply Two Numbers");
            System.out.println("Press 2 : Multiply Three Numbers");
            System.out.println("-------------------------");
            System.out.println("Press 3 : Exit to Main Menu");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Multiplication of Two Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        double mulResult = multi(num1, num2);
                        System.out.println("-------------------------");
                        System.out.println("Your Multiplication Result: " + mulResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        multiplyChoice = sc.next().toLowerCase().charAt(0);
                    } while (multiplyChoice != 'n');
                }
                case 2 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Multiplication of Three Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        System.out.print("Enter Number3: ");
                        double num3 = sc.nextDouble();
                        double mulResult = multi(num1, num2, num3);
                        System.out.println("-------------------------");
                        System.out.println("Your Multiplication Result: " + mulResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        multiplyChoice = sc.next().toLowerCase().charAt(0);
                    } while (multiplyChoice != 'n');
                }
                case 3 -> {
                    System.out.println("-------------------------");
                    System.out.println("Exiting to Main Menu :-)");
                    System.out.println("-------------------------");
                    timerLoading();
                }
                default -> {
                    System.out.println("-------------------------");
                    System.out.println("Ops!! Invalid choice. Please try again.");
                    System.out.println("-------------------------");
                }
            }
        } while (choice != 3);
    }

    public void divisionMenu() {
        int choice;
        char divisionChoice;
        do {
            timerLoading();
            System.out.println("-------------------------");
            System.out.println("Welcome to Division Menu");
            System.out.println("-------------------------");
            System.out.println("Press 1 : Divide Two Numbers");
            System.out.println("Press 2 : Divide Three Numbers");
            System.out.println("-------------------------");
            System.out.println("Press 3 : Exit to Main Menu");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Division of Two Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        double divResult = div(num1, num2);
                        System.out.println("-------------------------");
                        System.out.println("Your Division Result: " + divResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        divisionChoice = sc.next().toLowerCase().charAt(0);
                    } while (divisionChoice != 'n');
                }
                case 2 -> {
                    do {
                        System.out.println("-------------------------");
                        System.out.println("Let's Perform Division of Three Numbers");
                        System.out.println("-------------------------");
                        System.out.print("Enter Number1: ");
                        double num1 = sc.nextDouble();
                        System.out.print("Enter Number2: ");
                        double num2 = sc.nextDouble();
                        System.out.print("Enter Number3: ");
                        double num3 = sc.nextDouble();
                        double sumResult = div(num1, num2, num3);
                        System.out.println("-------------------------");
                        System.out.println("Your Division Result: " + sumResult);
                        System.out.println("-------------------------");
                        System.out.println("Do you want to continue? y or n");
                        divisionChoice = sc.next().toLowerCase().charAt(0);
                    } while (divisionChoice != 'n');
                }
                case 3 -> {
                    System.out.println("-------------------------");
                    System.out.println("Exiting to Main Menu :-)");
                    System.out.println("-------------------------");
                    timerLoading();
                }
                default -> {
                    System.out.println("-------------------------");
                    System.out.println("Ops!! Invalid choice. Please try again.");
                    System.out.println("-------------------------");
                }
            }
        } while (choice != 3);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double sub(double a, double b, double c) {
        return a - b - c;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double multi(double a, double b, double c) {
        return a * b * c;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double div(double a, double b, double c) {
        return a / b / c;
    }
}
