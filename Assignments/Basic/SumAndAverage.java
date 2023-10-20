package Assignments.Basic;

import java.util.Scanner;

public class SumAndAverage {
    //Java Program to input 5 numbers from the keyboard and find their sum and average.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers to get Sum and Average: ");
        int num;
        int sum = 0;
        for(int i=1; i<=5 ; i++) {
            System.out.print("Number " + i + ": " );
            num = sc.nextInt();
            sum += num;
        }
        double avg = sum/5;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
    }
}
