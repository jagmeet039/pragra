package Sep23;

public class StarPattern {
    public static void main(String[] args) {
//        * * * * *     i->5 and j->i
//        * * * *
//        * * *
//        * *
//        *

        for(int i=0 ; i <= 5 ; i++){
            for(int j=4 ; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
