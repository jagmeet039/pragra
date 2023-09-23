package Assignments;

import java.util.Scanner;

public class GreatestOfThree {
    //Java program that takes three numbers from the user and prints the greatest number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd num: ");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd num: ");
        int num3 = sc.nextInt();

        int greatest = num1;

        if(num2 > greatest){
            greatest = num2;
        }

        if(num3 > greatest){
            greatest = num3;
        }

        System.out.println("The Greatest Num is: " + greatest);

    }
}
