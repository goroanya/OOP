package AbstractFactory;

public class TVSet implements ITVSet {
    protected String model;
    protected int diagonal;
    protected String resolution;

    @Override
    public void turnOn() {
        System.out.println("Default TV Set tv set is turned on...");
    }
}
