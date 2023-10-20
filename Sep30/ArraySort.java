package Sep30;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {10,203,43,435,232,45,56};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                int temp = arr[i];
                if(arr[i] > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
