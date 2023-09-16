package Sep16;

import java.util.Scanner;

public class CallCenterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Our Help Center");
        System.out.println("-----------");
        System.out.println("Our Service Menu");
        System.out.println("Enter 1 for : Internet");
        System.out.println("Enter 2 for : Mobile");
        System.out.println("Enter 3 for : Cable Connection");
        System.out.println("Enter 9 for : Any other query");
        System.out.println("-------------");

        System.out.print("Enter your Input: ");
        int input = sc.nextInt();

        if(input == 1){
            System.out.println("You've selected Internet");
            System.out.println("---------------");
            System.out.println("Enter 1 for : Connection Issue");
            System.out.println("Enter 2 for : Bill Payment Issue");
            System.out.println("Enter 3 for : Chat with an Agent");

            System.out.print("Enter your Input: ");
            int internetInput  = sc.nextInt();

            if(internetInput == 1){
                System.out.println("You've selected Connection Issue");
                System.out.println("We've registered your concern successfully!!");
                System.out.println("Thank you for bring up :-)");
            }else if(internetInput == 2){
                System.out.println("You've selected Billing Issue");
                System.out.println("We've registered your concern successfully!!");
                System.out.println("Thank you for bring up :-)");
            }else if(internetInput == 3){
                System.out.println("You've selected Chat Connection");
                System.out.println("Connected to Agent successfully!!");
            }else{
                System.out.println("Invalid Input");
            }
        } else if(input == 2) {
            System.out.println("You've selected Mobile");
            System.out.println("---------------");
            System.out.println("Enter 1 for : Network Issue");
            System.out.println("Enter 2 for : Report Phone Lost");
            System.out.println("Enter 3 for : Chat with an Agent");

            System.out.print("Enter your Input: ");
            int internetInput  = sc.nextInt();

            if(internetInput == 1){
                System.out.println("You've selected Network Issue!! Select the Operator");
                System.out.println("---------------");
                System.out.println("Enter 1 for : Rogers");
                System.out.println("Enter 2 for : Lucky Mobile");
                System.out.println("Enter 3 for : Fido");

                System.out.print("Enter your Input: ");
                int mobileInput  = sc.nextInt();

                if(mobileInput == 1){
                    System.out.println("Report Registered for Roger's Mobile Connection");
                }else if(mobileInput == 2){
                    System.out.println("Report Registered for Lucky Mobile's Connection");
                }else if(mobileInput == 3){
                    System.out.println("Report Registered for Fido's Mobile Connection");
                }else{
                    System.out.println("Invalid Input");
                }

            }else if(internetInput == 2){
                System.out.println("You've selected Report Phone Lost");
                System.out.println("We've registered your concern successfully!!");
                System.out.println("Thank you for bring up :-)");
            }else if(internetInput == 3){
                System.out.println("You've selected Chat Connection");
                System.out.println("Connected to Agent successfully!!");
            }else{
                System.out.println("Invalid Input");
            }
        } else if(input == 3){
            System.out.println("You've selected Cable Connection!! ");
            System.out.println("---------------");
            System.out.println("Enter 1 for : New Connection");
            System.out.println("Enter 2 for : Old Connection");
        } else if(input == 9){
            System.out.println("You've selected Other Query");
            System.out.println("---------------");
            System.out.println("Please reach out to us via phone call at 4379819612");
            System.out.println("Thank You!!");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
