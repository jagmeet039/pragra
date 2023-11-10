import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        String[] result = new String[input];

        for(int i = 0; i < input ; i++) {

            int num = i+1;

            if(num%3 == 0 && num%5 == 0){
                result[i] = "FizzBuzz";
            }else if(num%3 == 0){
                result[i] = "Fizz";
            }else if(num%5 == 0){
                result[i] = "Buzz";
            }else{
                result[i] = String.valueOf(num);
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
