package Dsa.Problem1;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
      //  numbers.removeAt(4);
        numbers.indexOf(30);
        numbers.print();
    }
}
