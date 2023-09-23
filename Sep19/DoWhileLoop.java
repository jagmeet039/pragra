package Sep19;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number table you want: ");
        int number = sc.nextInt();
        System.out.println("Multiplication Table for "+ number + ":");
        int multiplier = 1;
        do {
            int result = number * multiplier;
            System.out.println(number + " x " + multiplier + " = " + result);
            multiplier++;
        } while (multiplier <= 10);
    }
}
