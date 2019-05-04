package State;

public class Tuesday implements IDay {
    @Override
    public void takeMorningDrugs() {
        System.out.println("Tuesday : Medicine #2 is used in the morning...");
    }

    @Override
    public void takeEveningDrugs() {
        System.out.println("Tuesday : Medicine #4 is used in the evening...");
    }
}
