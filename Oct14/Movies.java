package Oct14;

public class Movies {
    public static void main(String[] args) {
        Wood wood = new Wood("Movie",4);
        System.out.println(wood);
        System.out.println();
        Bollywood bollywood = new Bollywood("Hero",5,250,"Best Movie");
        System.out.println(bollywood);
        System.out.println();
        Titanic titanic = new Titanic("Zero", 2, 100, "Flop","long");
        System.out.println(titanic);
    }

}
