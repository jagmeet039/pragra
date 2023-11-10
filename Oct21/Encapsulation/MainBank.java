package Oct21.Encapsulation;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Bank bankApp = new Bank("Jagmeet","Savings", 7481,0);
        Scanner sc = new Scanner(System.in);
        int choice;
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
                    System.out.print("Your Balance is: ");
                    System.out.println("$"+ bankApp.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to Deposit: ");
                    int depositeAmount = sc.nextInt();
                    bankApp.deposit(depositeAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    bankApp.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(choice != 4);
    }
}
