package Assignments.Basic;

import java.util.Scanner;

public class OddNumberSum {
    //Java program that displays the sum of n odd natural numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Display Odd Natural Numbers upto: ");
        int num = sc.nextInt();

        if(num <= 0)
            System.out.println("Invalid Number");
        else {
            System.out.println("List of Odd numbers upto " + num + " is: ");
            int sumOdd = 0;
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0)
                    continue;
                System.out.println(i);
                sumOdd += i;
            }
            System.out.println("Total Sum  all above Odd numbers is: " + sumOdd);
        }
    }
}
