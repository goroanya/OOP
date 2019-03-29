package AbstractFactory;

//singleton

public class Fabric implements CountryFactory {

    private static Fabric fabric;

    @Override
    public TVSet getTVSet() {
        return new TVSet();
    }

    @Override
    public Computer getComputer() {
        return new Computer();
    }

    protected Fabric() {
    }

    public static Fabric getInstance() {
        if (fabric == null){
            fabric = new Fabric();
        }
        return fabric;
    }
}
