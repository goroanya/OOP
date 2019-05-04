package State;

public class Monday implements IDay {
    @Override
    public void takeMorningDrugs() {
        System.out.println("Monday : Medicine #1 is used in the morning...");
    }

    @Override
    public void takeEveningDrugs() {
        System.out.println("Monday : Medicine #4 is used in the evening...");
    }
}
