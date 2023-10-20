package Test.Arrays;

public class Array {
    private int[] array;
    private int count;
   public Array(int length){
       array = new int[length];
   }

   public void insert(int item){
       array[count] = item;
       count++;
   }

   public void print(){
       for (int i = 0; i < count; i++) {
           System.out.println(array[i]);
       }
   }
}
