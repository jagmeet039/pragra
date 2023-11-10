package Nov07.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Map<String, String> userMap = new HashMap<>();
        Credentials user = new Credentials();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add User");
            System.out.println("2. Update Password");
            System.out.println("3. Print Users");
            System.out.println("4. Validate User");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.addUser(scanner, userMap);
                    break;
                case 2:
                    user.updatePassword(scanner, userMap);
                    break;
                case 3:
                    user.printUsers(userMap);
                    break;
                case 4:
                    user.validateUser(scanner, userMap);
                    break;
                case 5:
                    System.out.println("Thank you for Using!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
