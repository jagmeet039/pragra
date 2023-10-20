package Assignments.Basic;

import java.util.Scanner;

public class MultiplicationTable {
    //Java program to display the multiplication table of a given integer.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get its Table Chart: ");
        int num = sc.nextInt();
        System.out.print("Enter upto Table length: ");
        int upto = sc.nextInt();
        int result;

        for(int i = 1 ; i <= upto ; i++ ){
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

    }
}
