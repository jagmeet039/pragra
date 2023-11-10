package Oct10;

public class Bed {
    String size;  //variables   //fields // attributes
    String color;
    int quantity;

    public Bed(String size, String color, int quantity) {
        this.size = size;
        this.color = color;
        this.quantity = quantity;
    }

    public void printBed(){   //method   //functions
        System.out.println("Bed Size: " + size);
        System.out.println("Bed Color: " + color);
        System.out.println("Bed quantity: " + quantity);
    }
}
