package Assignments.Basic;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        String input = sc.nextLine().toLowerCase();

        if(input.length() > 1)
            System.out.println("Invalid Character!!");
        else{
            char letter = input.charAt(0);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Input letter is: Vowel");
                    break;
                default:
                    System.out.println("Input letter is: Consonant");
            }
        }
    }
}
