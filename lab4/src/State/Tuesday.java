package State;

public class Tuesday implements IDay {
    @Override
    public void takeMorningGrugs() {
        System.out.println("Tuesday : Medicine #2 is used in the morning...");
    }

    @Override
    public void takeEveningGrugs() {
        System.out.println("Tuesday : Medicine #4 is used in the evening...");
    }
}
