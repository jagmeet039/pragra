package Assignments.BankingSystemApp;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1130;
        int choice;
        int totalDeposit = 0;
        int totalWithdraw = 0;
        int depositCount = 0;
        int withdrawCount = 0;
        System.out.println("Menu Menu");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Make a Deposit");
        System.out.println("3. Make a Withdrawal");
        System.out.println("4. Print Account Summary");
        System.out.println("5. Exit");
        do{
            System.out.print("Main Menu Input: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your Balance is");
                    System.out.println("$"+ balance);
                    break;
                case 2:
                    System.out.print("Enter amount to Deposit: ");
                    int depositeAmount = sc.nextInt();
                    totalDeposit += depositeAmount;
                    depositCount++;
                    balance += depositeAmount;
                    System.out.println("Deposit Successful!");
                    break;
                case 3:
                    System.out.print("Enter amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    totalWithdraw += withdrawAmount;
                    withdrawCount++;
                    if(withdrawAmount <= balance){
                        balance -= withdrawAmount;
                        System.out.println("Withdraw Successful!");
                    }else{
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    System.out.println("Account Summary");
                    System.out.println("Your Balance: " + balance);
                    System.out.println("Total No. of Deposit Made: " + depositCount);
                    System.out.println("Total Amount of Deposit: " + totalDeposit);
                    System.out.println("Total No. of Withdraw Made: " + withdrawCount);
                    System.out.println("Total Amount of Withdraw: " + totalWithdraw);
                    break;
                case 5:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(choice != 5);
    }
}
