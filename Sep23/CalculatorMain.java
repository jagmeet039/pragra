package Sep23;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorMethods app = new CalculatorMethods();

        //sum
        System.out.print("Sum: ");
        System.out.println(app.sum(10,3));

        //sub
        System.out.print("Sub: ");
        System.out.println(app.sub(10,3));

        //multi
        System.out.print("Multi: ");
        System.out.println(app.multi(10,3));

        //div
        System.out.print("Div: ");
        System.out.println(app.div(10,4));
    }
}
