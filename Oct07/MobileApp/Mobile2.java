package Oct07.MobileApp;

public class Mobile2 {
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

    //all Setters
    public void setBrand(String brandName){
        brand = brandName;
    }

    public void setColor(String colorName){
        color = colorName;
    }

    public void setScreenSize(int sizeValue){
        screenSize = sizeValue;
    }

    public void setMemory(int memoryValue){
        memory = memoryValue;
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
