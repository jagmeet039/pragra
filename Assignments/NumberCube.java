package Assignments;

import java.util.Scanner;

public class NumberCube {
    //Java program to display the cube of the given number up to an integer.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find its Cube: ");
        int num = sc.nextInt();
        int result = num*num*num;
        System.out.println("Cube of " + num + " is: " + result);
    }
}
