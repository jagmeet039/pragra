package Oct14.Polymorphism;

public class BankMain {
    public static void main(String[] args) {
        Bank scotiabank = new Scotiabank(1000,5,4);
        System.out.println("Scotia Interest: " + scotiabank.rateOfInterest());

        Bank tdbank = new TDbank(2000,3,6);
        System.out.println("TD Interest: " + tdbank.rateOfInterest());
    }
}
