package Assignments;

import java.util.Scanner;

public class NaturalNumSum {
    //Java program to display n terms of natural numbers and their sum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Display Natural Numbers upto: ");
        int num = sc.nextInt();
        int sum = 0;

        if(num<0)
            System.out.println("Invalid Number");
        else {
            for (int i = 1; i <= num; i++) {
                System.out.println(i);
                sum += i;
            }

            System.out.println("Sum of above Natural Numbers is: " + sum);
        }

    }
}
