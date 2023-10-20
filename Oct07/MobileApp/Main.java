package Oct07.MobileApp;

public class Main {
    public static void main(String[] args) {
       Mobile1 mobile1 = new Mobile1();
       Mobile2 mobile2 = new Mobile2();

       mobile2.setBrand("Iphone");
       System.out.println("Mobile2 Brand Name: "+mobile2.getBrand());

       mobile2.setColor("Black");
       System.out.println("Mobile2 Color Name: "+ mobile2.getColor());

       mobile2.setScreenSize(16);
       System.out.println("Mobile2 Screen Size: "+ mobile2.getScreenSize());

       mobile2.setMemory(32);
       System.out.println("Mobile2 Memory Size: "+ mobile2.getMemory());

       System.out.println("Checking Mobile 2: ");
       mobile2.call();
       mobile2.message();
       mobile2.calculate();
       mobile2.surfInternet();

       System.out.println("Mobile1 Brand Name: "+ mobile1.getBrand());
       System.out.println("Mobile1 Color Name: "+ mobile1.getColor());
       System.out.println("Mobile1 Screen Size: "+ mobile1.getScreenSize());
       System.out.println("Mobile1 Memory Size: "+ mobile1.getMemory());

        System.out.println("Checking Mobile 2: ");
        mobile1.call();
        mobile1.message();
        mobile1.calculate();
        mobile1.surfInternet();
    }
}
