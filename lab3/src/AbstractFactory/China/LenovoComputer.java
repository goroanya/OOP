package AbstractFactory.China;

import AbstractFactory.Computer;


public class LenovoComputer extends Computer {

    public LenovoComputer() {

        this.model = "Lenovo Legion Y520-15IKBM Black (80YY009FRA)";
        this.RAM = 8;
        this.processor = "Intel Core i5-7300HQ";
    }

    @Override
    public String toString() {
        return "Lenovo Computer  {" +
                "model='" + model + '\'' +
                ", RAM=" + RAM +
                ", processor='" + processor + '\'' +
                '}';
    }

    public void run() {
        System.out.println("Lenovo computer is running...");
    }
}

