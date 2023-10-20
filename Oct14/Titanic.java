package Oct14;

public class Titanic extends Bollywood{
    String type;

    public Titanic(String title, int rating, int price, String comment, String type) {
        super(title, rating, price, comment);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Titanic{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", comment='" + comment + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
