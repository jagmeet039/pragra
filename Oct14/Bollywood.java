package Oct14;

public class Bollywood extends Wood{
    int price;
    String comment;

    public Bollywood(String title, int rating, int price, String comment) {
        super(title, rating);
        this.price = price;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Bollywood{" +
                "price=" + price +
                ", comment='" + comment + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
