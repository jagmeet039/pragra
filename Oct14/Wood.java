package Oct14;

public class Wood extends Movies{
    String title;
    int rating;

    public Wood(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Wood{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
