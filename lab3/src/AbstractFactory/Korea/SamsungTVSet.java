package AbstractFactory.Korea;

import AbstractFactory.TVSet;

public class SamsungTVSet extends TVSet {

    public SamsungTVSet() {
        this.model = "Samsung UE43N5000AUXUA";
        this.diagonal = 43;
        this.resolution = "1920x1080";
    }

    @Override
    public String toString() {
        return "SamsungTVSet  {" +
                "model='" + model + '\'' +
                ", diagonal=" + diagonal +
                ", resolution='" + resolution + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung TV Set tv set is turned on...");
    }
}
