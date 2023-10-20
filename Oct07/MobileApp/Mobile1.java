package Oct07.MobileApp;

public class Mobile1 {
    private String brand;
    private String color;
    private int screenSize;
    private int memory;

    //all Getters
    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public int getScreenSize(){
        return screenSize;
    }

    public int getMemory(){
        return memory;
    }

    public void call(){
        System.out.println("Calling...");
    }

    public void surfInternet(){
        System.out.println("Searching...");
    }

    public void calculate(){
        System.out.println("Calculating...");
    }

    public void message(){
        System.out.println("Messaging...");
    }


}
