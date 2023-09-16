package Sep13;

public class MultiCondition {
    public static void main(String[] args) {
        int age = 16;
        if(age < 16){
            System.out.println("you cannot drive");
        } else if(age >= 16 && age < 19){
            System.out.println("you can drive on 400 highways");
        } else if(age >= 19 && age < 65){
            System.out.println("you are eligible to drive");
        } else if(age >= 65){
            System.out.println("need to take permission from wife");
        } else{
            System.out.println("invalid input");
        }

        System.out.println("---------------");

        boolean hasGlisence = true;
        double bal = 2.5;

        if(age<19 && hasGlisence){
            System.out.println("you should have BAL to 0.0");
        } else if(age >=19 && hasGlisence){
            System.out.println("you can have BAL to 0.05");
        } else if(age <=19 && hasGlisence && bal > 0.05){
            System.out.println("ticketed");
        }

    }
}
