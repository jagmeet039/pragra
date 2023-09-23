package Assignments;

import java.util.Scanner;

public class GuessLuckyNumber {
    //Java Program to guess your lucky number within 5 Attempts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luckyNum = 10;
        int numOfAttempts = 4;

        System.out.println("Lets Guess the Lucky Number between 1-100:");

        while(numOfAttempts >= 0){
            int inputNum = sc.nextInt();

            if(inputNum<1 || inputNum>100)
                System.out.println("Invalid Range");

            if(inputNum == luckyNum) {
                System.out.println("Wow!! Congratulations you won");
                sc.close();
            }
            else if(numOfAttempts == 0)
                System.out.println("Better Luck next Time");
            else
                System.out.println("Opps!! Try one more time. " + numOfAttempts + " more attempts Left!" );
            numOfAttempts--;
        }

    }
}
