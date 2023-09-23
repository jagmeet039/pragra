package Sep19;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number's sum you want to print: ");
        int finalNum = sc.nextInt();
        while(num <= finalNum){
            sum += num;
            num++;
        }
        System.out.print("Sum of first "+ finalNum + " num is " + sum);
    }
}
