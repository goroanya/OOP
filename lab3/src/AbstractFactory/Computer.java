package AbstractFactory;

public class Computer implements IComputer {
    protected String model ;
    protected int RAM ;
    protected String processor ;

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", RAM=" + RAM +
                ", processor='" + processor + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Default computer is running...");
    }
}
