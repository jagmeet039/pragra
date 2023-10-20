package Sep30;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,7,9,6,8};
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if(index < arr.length){
                result[index] = arr[i];
            }
            index++;
        }
        System.out.println(Arrays.toString(result));
    }
}
