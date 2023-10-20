package Oct03;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        // P R A G R A
        // 0 1 2 3 4 5
        // A R     R P
        String input = "Pragra";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;   // 6 - 1 = 5
        while (start < end) {   //1 < 4
            char temp = chars[start];  //temp = P
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(chars));

    }
}
