package Prototype;

public class Money implements Copyable {
    protected int numberOfMoney;
    protected String currency = "USD";

    public Money(int numberOfMoney) {
        this.numberOfMoney = numberOfMoney;
    }

    @Override
    public String toString() {
        return "Money {" +
                "numberOfMoney=" + numberOfMoney +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new Money(numberOfMoney);
    }
}
