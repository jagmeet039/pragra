package Sep30;

import java.util.Scanner;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {10,203,43,435,232,43,56};

        int max = arr[0];

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
