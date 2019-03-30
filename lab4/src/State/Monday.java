package State;

public class Monday implements IDay {
    @Override
    public void takeMorningGrugs() {
        System.out.println("Monday : Medicine #1 is used in the morning...");
    }

    @Override
    public void takeEveningGrugs() {
        System.out.println("Monday : Medicine #4 is used in the evening...");
    }
}
