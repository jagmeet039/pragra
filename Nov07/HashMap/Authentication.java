package Nov07.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Authentication {

    //method to authenticate user and password
    public String authenticate(Scanner sc, Map<String, String> user){
        System.out.println();
        System.out.println("Credential Checker");
        System.out.print("Enter Username: ");
        String username = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();

        for(Map.Entry<String,String> entry: user.entrySet()){
            if(entry.getKey().equals(username) && entry.getValue().equals(password))
                return "Authentication Succesful";
        }

        return "Authentication Failed!!";
    }
}
