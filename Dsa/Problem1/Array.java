package Dsa.Problem1;

public class Array {
    private int count;
    private int[] arr;

    public Array(int length) {
        arr = new int[length];
    }

    public void insert(int item){
        if(count == arr.length){
            int[] newArr = new int[arr.length*2];

            for (int i = 0; i < count; i++)
                newArr[i] = arr[i];

            arr = newArr;
        }
        arr[count] = item;
        count++;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            arr[i] = arr[i+1];

        count--;
    }

    public void indexOf(int elem){
        int index = -1;
        for (int i = 0; i < count; i++) {
            if(arr[i] == elem)
                index = i;
        }
        System.out.println(index);
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}
