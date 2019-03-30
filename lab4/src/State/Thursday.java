package State;

public class Thursday implements IDay {
    @Override
    public void takeMorningGrugs() {
        System.out.println("Thursday : Medicine #1 is used in the morning...");
    }

    @Override
    public void takeEveningGrugs() {
        System.out.println("Thursday : Medicine #4 is used in the evening...");
    }
}
