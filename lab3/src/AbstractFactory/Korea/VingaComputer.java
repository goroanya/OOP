package AbstractFactory.Korea;

import AbstractFactory.Computer;

public class VingaComputer extends Computer {

    VingaComputer() {
        this.model = "VINGA MINI BOX B300WP (AB3N4200.464WP)";
        this.RAM = 4;
        this.processor = "Intel Pentium N4200";
    }


    @Override
    public String toString() {
        return "Vinga Computer  {" +
                "model='" + model + '\'' +
                ", RAM=" + RAM +
                ", processor='" + processor + '\'' +
                '}';
    }

    public void run() {
        System.out.println("Vinga computer is running...");
    }
}
