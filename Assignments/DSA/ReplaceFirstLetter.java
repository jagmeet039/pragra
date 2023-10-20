package Assignments.DSA;

import java.util.Arrays;

public class ReplaceFirstLetter {
    public static void main(String[] args) {
        String para = "hi my name is jagmeet";

        System.out.println(para);

        char[] charArr = para.toCharArray();

        charArr[0] = Character.toUpperCase(charArr[0]);

        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ' '){
                char ch = Character.toUpperCase(charArr[i+1]);
                charArr[i+1] = ch;
            }
        }

        System.out.println(charArr);

    }
}
