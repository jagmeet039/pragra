package Nov07.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String,String> user = new HashMap<>();
        Authentication auth = new Authentication();
        Scanner sc = new Scanner(System.in);

        //enter 5 records and at 6th add Sam with sam123
        user.put("Jagmeet","jagmeet123");
        user.put("Sahil","sahil123");
        user.put("Iqbal","iqbal123");
        user.put("Joshi","joshi123");
        user.put("Rohit","rohit123");
        user.put("Sam","sam123");

        //enhanced loop - Print username and passowrd
        for(Map.Entry<String, String> entry: user.entrySet()){
            System.out.println("Username: " + entry.getKey() + " and Password: " + entry.getValue());
        }

        System.out.println();

        //update password for Sam
        user.put("Sam","sam789");

        //get password for Sam
        System.out.println("Updated Password for Sam is: " + user.get("Sam"));

        //validation
        System.out.println(auth.authenticate(sc, user));

    }
}
