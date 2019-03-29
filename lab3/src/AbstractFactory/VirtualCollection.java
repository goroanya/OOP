package AbstractFactory;

public class VirtualCollection {
    private TVSet tvSet;
    private Computer computer;

    public VirtualCollection(CountryFactory factory){
        this.tvSet = factory.getTVSet();
        this.computer = factory.getComputer();
    }

    public void checkPerformance(){
        tvSet.turnOn();
        computer.run();
    }
}
