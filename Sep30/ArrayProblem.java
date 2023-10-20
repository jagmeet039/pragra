package Sep30;

import java.util.Arrays;

public class ArrayProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,20,3,4,45,23,3,25,6};

        for (int i=0; i<arr.length;i++){
            if(arr[i] == 3 && arr[i+1] == 4){
                arr[i+1] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
