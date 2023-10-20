package Sep30;

public class SwapVariable {
    public static void main(String[] args) {
        int x = 30;
        int y = 50;

        // 30+50 = 80

        System.out.println("Before");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("--------");

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
