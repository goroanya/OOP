package State;

public class Sunday implements IDay {
    @Override
    public void takeMorningDrugs() {
        System.out.println("Sunday : It is break!");
    }

    @Override
    public void takeEveningDrugs() {
        System.out.println("Sunday : It is break!");
    }

}
