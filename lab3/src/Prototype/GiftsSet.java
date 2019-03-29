package Prototype;

public class GiftsSet {

    private Toy toy;
    private Candy candy;
    private Money money;

    public GiftsSet(String typeOfToy, String typeOfCandy, int numberOfMoney) {
        toy = new Toy(typeOfToy);
        candy = new Candy(typeOfCandy);
        money = new Money(numberOfMoney);
    }

    public Toy getToy() {
        return (Toy) toy.copy();
    }

    public Candy getCandy() {
        return (Candy) candy.copy();
    }

    public Money getMoney() {
        return (Money) money.copy();
    }

}
