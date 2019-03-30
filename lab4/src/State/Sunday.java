package State;

public class Sunday implements IDay {
    @Override
    public void takeMorningGrugs() {
        System.out.println("Sunday : It is break!");
    }

    @Override
    public void takeEveningGrugs() {
        System.out.println("Sunday : It is break!");
    }

}
