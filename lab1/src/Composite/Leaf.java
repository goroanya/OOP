package Composite;

public class Leaf implements Component {

    private String name;
    private int money = 100;

    public Leaf(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void add(Component component) {
        //this is leaf node so this method is not applicable to this class.
        System.out.println("Impossible operation!");
    }

    @Override
    public int getMoney() {
        System.out.println("From " + this.name + " : " + this.money);
        return this.money;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
