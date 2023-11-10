package ExcelSheet.Arrays;

import java.util.ArrayList;

public class FirstnLastOccurence {
    ArrayList<Integer> find(int arr[], int n, int x) {
        // code here
       ArrayList list = new ArrayList();
       int firstIndex = 0;
       int lastIndex = 0;
       for (int i = 0; i < arr.length ; i++) {
           if(arr[i] == x) {
               firstIndex = i;
               break;
           }
       }
       if(firstIndex == 0){
           firstIndex = -1;
       }
        for (int i = arr.length-1 ; i > 0; i--) {
            if(arr[i] == x) {
                lastIndex = i;
                break;
            }
        }
        if(lastIndex == 0){
            lastIndex = -1;
        }
        list.add(firstIndex);
        list.add(lastIndex);
        return list;
    }
    public static void main(String[] args) {
        FirstnLastOccurence ob = new FirstnLastOccurence();
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n = arr.length;
        int x = 7;
        ArrayList<Integer> ans = ob.find(arr,n,x);
        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}
