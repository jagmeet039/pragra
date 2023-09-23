package Sep19;

import java.sql.SQLOutput;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("List of Even Numbers");
        int sumEven = 0;
        for(int i=1; i<=100 ; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
            sumEven += i;
        }
        System.out.println("Total Sum: " + sumEven);

        System.out.println("-------------------");

        System.out.println("List of Odd Numbers");
        int sumOdd = 0;
        for(int i=1; i<=100 ; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
            sumOdd += i;
        }
        System.out.println("Total Sum: " + sumOdd);

    }
}
