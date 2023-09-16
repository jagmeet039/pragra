package Sep13;

public class Comparison {
    public static void main(String[] args) {

        int x = 11;

        //check even or odd
        if( x % 2 == 0){
            System.out.println(x + " is even");
        } else{
            System.out.println(x + " is odd");
        }

        //check positive or negative
        if( x < 0){
            System.out.println(x + " is Negative");
        } else{
            System.out.println(x + " is Positive");
        }
    }
}
