package Nov07.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Credentials {
    public void addUser(Scanner scanner, Map<String, String> userMap) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        userMap.put(username, password);
        System.out.println("User added successfully!");
    }

    public void updatePassword(Scanner scanner, Map<String, String> userMap) {
        System.out.print("Enter username for password update: ");
        String username = scanner.next();
        if (userMap.containsKey(username)) {
            System.out.print("Enter new password: ");
            String newPassword = scanner.next();
            userMap.put(username, newPassword);
            System.out.println("Password updated successfully!");
        } else {
            System.out.println("Username not found. Please try again.");
        }
    }

    public void printUsers(Map<String, String> userMap) {
        System.out.println("---------------------");
        System.out.println("Users Details : Username and Password");
        for (Map.Entry<String, String> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
        System.out.println("--------------------");
    }

    public void validateUser(Scanner scanner, Map<String, String> userMap) {
        System.out.print("Enter username for validation: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (userMap.containsKey(username) && userMap.get(username).equals(password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed. Please check your username and password.");
        }
    }

}
