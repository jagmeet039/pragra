package Oct14.Polymorphism;

public class TDbank extends Bank {
    double principal;
    double rate;
    double time;

    public TDbank(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    @Override
    public double rateOfInterest() {
        return principal*(rate/100)*time;
    }
}
