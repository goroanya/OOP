package AbstractFactory.China;


import AbstractFactory.TVSet;

public class HisenseTVSet extends TVSet {

    public HisenseTVSet() {
        this.model ="Hisense 43M5010UW";
        this.diagonal = 43;
        this.resolution = "3840x2160";
    }

    @Override
    public String toString() {
        return "HisenseTVSet  {" +
                "model='" + model + '\'' +
                ", diagonal=" + diagonal +
                ", resolution='" + resolution + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Hisense TV Set tv set is turned on...");
    }
}
