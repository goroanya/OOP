package State;

public class Wednesday implements IDay {
    @Override
    public void takeMorningDrugs() {
        System.out.println("Wednesday : Medicine #3 is used in the morning...");
    }

    @Override
    public void takeEveningDrugs() {
        System.out.println("Wednesday : Medicine #4 is used in the evening...");
    }
}
